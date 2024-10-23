package com.example.blogging.dto;

import com.example.blogging.entity.Post_x_tag;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public class TagDto {

    @NotBlank
    @Max(value = 80, message = "EL  nombre del tag  tiene un límite de 80 caracteres")
    private String name_tag;

    public TagDto(String name_tag) {
        this.name_tag = name_tag;
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
}
