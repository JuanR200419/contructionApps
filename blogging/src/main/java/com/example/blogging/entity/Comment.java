package com.example.blogging.entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_comment;

    @Column(name = "text")
    private String text;

    @Column(name = "date_comment")
    private Date date_comment;

    @ManyToOne
    @JoinColumn(name = "id_post")
    private Post post;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    public Comment() {
        super();
    }

    public Comment(long id_comment, String text, Date date_comment, Post post, User user) {
        this.id_comment = id_comment;
        this.text = text;
        this.date_comment = date_comment;
        this.post = post;
        this.user = user;
    }

    public Comment(String text, Date date_comment, Post post, User user) {
        this.text = text;
        this.date_comment = date_comment;
        this.post = post;
        this.user = user;
    }

    public long getId_comment() {
        return id_comment;
    }

    public void setId_comment(long id_comment) {
        this.id_comment = id_comment;
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
