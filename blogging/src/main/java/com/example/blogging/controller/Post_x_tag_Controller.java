package com.example.blogging.controller;

import com.example.blogging.services.Post_x_tag_Service;
import com.example.blogging.dto.Post_x_tag_Dto;
import com.example.blogging.entity.Post_x_tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/post_x_tags")
public class Post_x_tag_Controller {

    @Autowired
    private Post_x_tag_Service post_x_tag_Service;

    @GetMapping
    public List<Post_x_tag> findAll() {
        return post_x_tag_Service.findAll();
    }

    @GetMapping("/{id}")
    public Post_x_tag findById(@PathVariable Long id) {
        return post_x_tag_Service.findById(id).orElse(null);
    }

    @PostMapping
    public Post_x_tag createPost_x_tag( @Valid  @RequestBody Post_x_tag_Dto post_x_tag_Dto) {
        return post_x_tag_Service.createPost_x_tag(post_x_tag_Dto);
    }

    @PutMapping("/{id}")
    public boolean updatePost_x_tag(@Valid @PathVariable Long id, @RequestBody Post_x_tag_Dto post_x_tag_Dto) {
        return post_x_tag_Service.updatePost_x_tag(id, post_x_tag_Dto);
    }

    @DeleteMapping("/{id}")
    public boolean deletePost_x_tag(@PathVariable Long id) {
        return post_x_tag_Service.deletePost_x_tag(id);
    }
}
