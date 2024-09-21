package com.example.blogging.controller;

import com.example.blogging.dto.PostDto;
import com.example.blogging.entity.Post;
import com.example.blogging.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping
    public List<Post> findAll() {
        return postService.findAll();
    }

    @GetMapping("/{id}")
    public Post findById(@PathVariable Long id) {
        return postService.findById(id).orElse(null);
    }

    @PostMapping
    public Post createPost(@RequestBody PostDto postDto) {
        return postService.createPost(postDto);
    }

    @PutMapping("/{id}")
    public boolean updatePost(@PathVariable Long id, @RequestBody PostDto postDto) {
        return postService.updatePost(id, postDto);
    }

    @DeleteMapping("/{id}")
    public boolean deletePost(@PathVariable Long id) {
        return postService.deletePost(id);
    }
}
