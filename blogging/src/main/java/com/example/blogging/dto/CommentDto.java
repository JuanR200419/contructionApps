package com.example.blogging.dto;

import com.example.blogging.entity.Post;
import com.example.blogging.entity.User;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.sql.Date;

public class CommentDto {
    private String text;

    private Date date_comment;

    private Post post;

    private User user;

    public CommentDto() {
        super();
    }

    public CommentDto(String text, Date date_comment, Post post, User user) {
        this.text = text;
        this.date_comment = date_comment;
        this.post = post;
        this.user = user;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate_comment() {
        return date_comment;
    }

    public void setDate_comment(Date date_comment) {
        this.date_comment = date_comment;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
