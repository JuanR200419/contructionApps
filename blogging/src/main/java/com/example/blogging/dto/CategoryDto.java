package com.example.blogging.dto;

import com.example.blogging.entity.Post_x_category;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.util.List;
public class CategoryDto {

    @NotBlank
    @Max(value = 80, message = "La dirección tiene un límite de 80 caracteres")
    private String name_category;

    public CategoryDto(String name_category) {
        this.name_category = name_category;
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

}
