package com.example.blogging.controller;

import com.example.blogging.services.Post_x_category_Service;
import com.example.blogging.dto.Post_x_category_Dto;
import com.example.blogging.entity.Post_x_category;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/post_x_category")
public class Post_x_category_Controller {

    @Autowired
    private Post_x_category_Service post_x_category_Service;

    @GetMapping
    public List<Post_x_category> findAll() {
        return post_x_category_Service.findAll();
    }

    @GetMapping("/{id}")
    public Post_x_category findById(@PathVariable Long id) {
        return post_x_category_Service.findById(id).orElse(null);
    }

    @PostMapping
    public Post_x_category createPost_x_category( @Valid  @RequestBody Post_x_category_Dto post_x_category_Dto) {
        return post_x_category_Service.createPost_x_category(post_x_category_Dto);
    }

    @PutMapping("/{id}")
    public boolean updatePost_x_category( @Valid @PathVariable Long id, @RequestBody Post_x_category_Dto post_x_category_Dto) {
        return post_x_category_Service.updatePost_x_category(id, post_x_category_Dto);
    }

    @DeleteMapping("/{id}")
    public boolean deletePost_x_category(@PathVariable Long id) {
        return post_x_category_Service.deletePost_x_category(id);
    }
}
