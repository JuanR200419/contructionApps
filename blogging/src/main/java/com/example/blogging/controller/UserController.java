package com.example.blogging.controller;

import com.example.blogging.services.UserSevice;
import com.example.blogging.dto.UserDto;
import com.example.blogging.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserSevice userSevice;

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
        return userSevice.createUser(userDto);
    }

    @PutMapping("/{id}")
    public boolean updateUser(@PathVariable Long id, @RequestBody UserDto userDto) {
        return userSevice.updateUser(id, userDto);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        userSevice.deleteUser(id);
    }
}
