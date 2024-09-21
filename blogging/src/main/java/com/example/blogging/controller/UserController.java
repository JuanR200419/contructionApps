package com.example.blogging.controller;

import com.example.blogging.services.UserSevice;
import com.example.blogging.dto.UserDto;
import com.example.blogging.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    public User save(UserDto user) {
        return userSevice.createUser(user);
    }

    public void deleteById(Long id) {
        userSevice.deleteUser(id);
    }

    public User createUser(UserDto userDto) {
        return userSevice.createUser(userDto);
    }

    public boolean updateUser(Long id, UserDto userDto) {
        return userSevice.updateUser(id, userDto);
    }
}
