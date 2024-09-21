package com.example.blogging.controller;

import com.example.blogging.services.Post_x_category_Service;
import com.example.blogging.dto.Post_x_category_Dto;
import com.example.blogging.entity.Post_x_category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    public Optional<Post_x_category> findById(Long id) {
        return post_x_category_Service.findById(id);
    }

    public boolean deletePost_x_category(Long id) {
        return post_x_category_Service.deletePost_x_category(id);
    }

    public Post_x_category createPost_x_category(Post_x_category_Dto post_x_category_Dto) {
        return post_x_category_Service.createPost_x_category(post_x_category_Dto);
    }

    public boolean updatePost_x_category(Long id, Post_x_category_Dto post_x_category_Dto) {
        return post_x_category_Service.updatePost_x_category(id, post_x_category_Dto);
    }
}
