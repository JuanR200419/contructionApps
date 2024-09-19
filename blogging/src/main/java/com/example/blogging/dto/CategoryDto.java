package com.example.blogging.dto;

import com.example.blogging.entity.Post_x_category;
import jakarta.persistence.*;

import java.util.List;

public class CategoryDto {


    private String name_category;

    private List<Post_x_category> post_x_category;

    public CategoryDto(String name_category, List<Post_x_category> post_x_category) {
        this.name_category = name_category;
        this.post_x_category = post_x_category;
    }
    public CategoryDto() {
        super();
    }

    public String getName_category() {
        return name_category;
    }

    public void setName_category(String name_category) {
        this.name_category = name_category;
    }

    public List<Post_x_category> getPost_x_category() {
        return post_x_category;
    }

    public void setPost_x_category(List<Post_x_category> post_x_category) {
        this.post_x_category = post_x_category;
    }
}
