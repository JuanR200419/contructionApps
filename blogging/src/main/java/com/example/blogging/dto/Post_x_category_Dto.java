package com.example.blogging.dto;

import com.example.blogging.entity.Category;
import com.example.blogging.entity.Post;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;

public class Post_x_category_Dto {

    private Category category;

    private Post post;

    public Post_x_category_Dto() {
        super();
    }

    public Post_x_category_Dto(Category category, Post post) {
        this.category = category;
        this.post = post;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
