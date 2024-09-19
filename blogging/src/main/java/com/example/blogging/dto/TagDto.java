package com.example.blogging.dto;

import com.example.blogging.entity.Post_x_tag;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;

import java.util.List;

public class TagDto {

    private String name_tag;

    private List<Post_x_tag> post_x_tag;

    public TagDto(String name_tag, List<Post_x_tag> post_x_tag) {
        this.name_tag = name_tag;
        this.post_x_tag = post_x_tag;
    }
    public TagDto() {
        super();

    }

    public String getName_tag() {
        return name_tag;
    }

    public void setName_tag(String name_tag) {
        this.name_tag = name_tag;
    }

    public List<Post_x_tag> getPost_x_tag() {
        return post_x_tag;
    }

    public void setPost_x_tag(List<Post_x_tag> post_x_tag) {
        this.post_x_tag = post_x_tag;
    }
}
