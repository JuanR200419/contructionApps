package com.example.blogging.dto;

import com.example.blogging.entity.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.sql.Date;
import java.util.List;

public class PostDto {
    @NotBlank
    @Max(value = 80, message = "EL titulo  tiene un límite de 80 caracteres")
    private String title;
    @Max(value = 350,message = "El mensaje tiene un limite de 350 caracteres")
    private String text;

    @NotNull
    @Pattern(regexp = "^[0-9]{4}-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])$", message = "Fecha debe estar en formato YYYY-MM-DD")
    private Date date_publication;

    @NotNull
    private int reactions;
    @NotNull
    private List<Post_x_category> post_x_category;

    @NotNull
    private List<Post_x_tag> post_x_tag;


    private State state;

    private User user;
    @NotNull
    private List<Comment> comment;

    public PostDto() {
        super();
    }

    public PostDto(String title, String text, Date date_publication, int reactions, List<Post_x_category> post_x_category, List<Post_x_tag> post_x_tag, State state, User user, List<Comment> comment) {
        this.title = title;
        this.text = text;
        this.date_publication = date_publication;
        this.reactions = reactions;
        this.post_x_category = post_x_category;
        this.post_x_tag = post_x_tag;
        this.state = state;
        this.user = user;
        this.comment = comment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate_publication() {
        return date_publication;
    }

    public void setDate_publication(Date date_publication) {
        this.date_publication = date_publication;
    }

    public int getReactions() {
        return reactions;
    }

    public void setReactions(int reactions) {
        this.reactions = reactions;
    }

    public List<Post_x_category> getPost_x_category() {
        return post_x_category;
    }

    public void setPost_x_category(List<Post_x_category> post_x_category) {
        this.post_x_category = post_x_category;
    }

    public List<Post_x_tag> getPost_x_tag() {
        return post_x_tag;
    }

    public void setPost_x_tag(List<Post_x_tag> post_x_tag) {
        this.post_x_tag = post_x_tag;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Comment> getComment() {
        return comment;
    }

    public void setComment(List<Comment> comment) {
        this.comment = comment;
    }
}
