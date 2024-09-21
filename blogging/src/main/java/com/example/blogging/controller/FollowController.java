package com.example.blogging.controller;

import com.example.blogging.services.FollowService;
import com.example.blogging.dto.FollowDto;
import com.example.blogging.entity.Follow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/follows")
public class FollowController {

    @Autowired
    private FollowService followService;

    @GetMapping
    public List<Follow> findAll() {
        return followService.findAll();
    }

    @GetMapping("/{id}")
    public Follow findById(@PathVariable Long id) {
        return followService.findById(id).orElse(null);
    }

    @PostMapping
    public Follow createFollow(@RequestBody FollowDto followDto) {
        return followService.createFollow(followDto);
    }

    @PutMapping("/{id}")
    public boolean updateFollow(@PathVariable Long id, @RequestBody FollowDto followDto) {
        return followService.updateFollow(id, followDto);
    }

    @DeleteMapping("/{id}")
    public boolean deleteFollow(@PathVariable Long id) {
        return followService.deleteFollow(id);
    }
}
