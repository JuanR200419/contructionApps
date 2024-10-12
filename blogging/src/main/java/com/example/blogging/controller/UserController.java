package com.example.blogging.controller;

import com.example.blogging.repository.UserRepository;
import com.example.blogging.services.JwtUtil;
import com.example.blogging.services.UserSevice;
import com.example.blogging.dto.UserDto;
import com.example.blogging.entity.User;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    @Autowired
    private final UserSevice userSevice;
    private final AuthenticationManager authenticationManager;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;

    @GetMapping
    public List<User> getAllUsers() {
        return userSevice.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        Optional<User> user = userSevice.findById(id);
        return user.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public User createUser(@RequestBody UserDto userDto) {
        userDto.setPassword(passwordEncoder.encode(userDto.getPassword()));
        return userSevice.createUser(userDto);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User user) {
        try {
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            user.getNickname(), user.getPassword()
                    )
            );
        } catch (AuthenticationException e) {
            e.printStackTrace();
            return ResponseEntity.status(401).body("Credenciales inválidas");
        }

        final UserDetails userDetails = userSevice.findByNickname(user.getNickname()).get();
        final String jwt = jwtUtil.generateToken(userDetails);

        return ResponseEntity.ok(jwt);
    }

    @PutMapping("/{id}")
    public boolean updateUser( @Valid @PathVariable Long id, @RequestBody UserDto userDto) {
        userDto.setPassword(passwordEncoder.encode(userDto.getPassword()));
        return userSevice.updateUser(id, userDto);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        userSevice.deleteUser(id);
    }
}
