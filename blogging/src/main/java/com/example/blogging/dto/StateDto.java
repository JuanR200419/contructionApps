package com.example.blogging.dto;

import com.example.blogging.entity.Post;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class StateDto {
    @NotBlank
    @Max(value = 80, message = "EL  nombre del estado  tiene un límite de 80 caracteres")
    private String name_state;

    private Post post;

public StateDto() {
    super();
}

    public StateDto(String name_state, Post post) {
        this.name_state = name_state;
        this.post = post;
    }

    public String getName_state() {
        return name_state;
    }

    public void setName_state(String name_state) {
        this.name_state = name_state;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
