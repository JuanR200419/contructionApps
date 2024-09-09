package com.example.blogging.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "posts_x_categories")
public class Post_x_category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_post_x_category;

    @ManyToOne
    @JoinColumn(name = "id_category")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "id_post")
    private Post post;

    public Post_x_category() {
        super();
    }

    public Post_x_category(long id_post_x_category, Category category, Post posts) {
        this.id_post_x_category = id_post_x_category;
        this.category = category;
        this.post = posts;
    }

    public Post_x_category(Category category, Post posts) {
        this.category = category;
        this.post = posts;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public long getId_post_x_category() {
        return id_post_x_category;
    }

    public void setId_post_x_category(long id_post_x_category) {
        this.id_post_x_category = id_post_x_category;
    }
}
