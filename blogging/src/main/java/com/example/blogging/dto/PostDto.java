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

    @Max(value = 350, message = "El mensaje tiene un limite de 350 caracteres")
    private String text;

    @NotNull
    @Pattern(regexp = "^[0-9]{4}-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])$", message = "Fecha debe estar en formato YYYY-MM-DD")
    private Date date_publication;

    @NotNull
    private int reactions;

    public PostDto() {
        super();
    }

    public PostDto(String title, String text, Date date_publication, int reactions) {
        this.title = title;
        this.text = text;
        this.date_publication = date_publication;
        this.reactions = reactions;
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
}
