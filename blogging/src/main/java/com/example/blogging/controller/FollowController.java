package com.example.blogging.controller;

import com.example.blogging.services.FollowService;
import com.example.blogging.dto.FollowDto;
import com.example.blogging.entity.Follow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    public Optional<Follow> findById(Long id) {
        return followService.findById(id);
    }

    public boolean deleteFollow(Long id) {
        return followService.deleteFollow(id);
    }

    public Follow createFollow(FollowDto followDto) {
        return followService.createFollow(followDto);
    }

    public boolean updateFollow(Long id, FollowDto followDto) {
        return followService.updateFollow(id, followDto);
    }
}
