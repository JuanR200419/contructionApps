package com.example.blogging.controller;

import com.example.blogging.services.CommentService;
import com.example.blogging.dto.CommentDto;
import com.example.blogging.entity.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/comments")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @GetMapping
    public List<Comment> findAll() {
        return commentService.findAll();
    }

    public Optional<Comment> findById(Long id) {
        return commentService.findById(id);
    }

    public boolean deleteComment(Long id) {
        return commentService.deleteComment(id);
    }

    public Comment createComment(CommentDto commentDto) {
        return commentService.createComment(commentDto);
    }

    public boolean updateComment(Long id, CommentDto commentDto) {
        return commentService.updateComment(id, commentDto);
    }
}
