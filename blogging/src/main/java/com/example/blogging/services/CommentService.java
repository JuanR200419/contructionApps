package com.example.blogging.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.blogging.repository.CommentRepository;
import com.example.blogging.dto.CommentDto;
import com.example.blogging.entity.Comment;

import java.util.List;
import java.util.Optional;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public List<Comment> findAll() {
        return commentRepository.findAll();
    }

    public Optional<Comment> findById(Long id) {
        return commentRepository.findById(id);
    }

    public boolean deleteComment(Long id) {
        commentRepository.deleteById(id);
        return true;
    }

    public Comment searchComment(Long id) {
        return commentRepository.findById(id).orElse(null);
    }

    public Comment createComment(CommentDto commentDto) {
        Comment commentInfo = new Comment();
        commentInfo.setText(commentDto.getText());
        commentInfo.setDate_comment(commentDto.getDate_comment());
        return commentRepository.save(commentInfo);
    }

    public boolean updateComment(Long id, CommentDto commentDto) {
        Optional<Comment> optionalComment = commentRepository.findById(id);
        if (optionalComment.isPresent()) {
            Comment commentToUpdate = optionalComment.get();
            commentToUpdate.setText(commentDto.getText());
            commentToUpdate.setDate_comment(commentDto.getDate_comment());
            commentRepository.save(commentToUpdate);
            return true;
        } else {
            return false;
        }
    }
}
