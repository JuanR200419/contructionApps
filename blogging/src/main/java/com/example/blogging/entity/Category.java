package com.example.blogging.entity;

import jakarta.persistence.*;


import jakarta.persistence.Entity;

import java.util.List;

@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_category;

    @Column(name = "name_category")
    private String name_category;

    @OneToMany(mappedBy = "category", cascade = CascadeType.PERSIST)
    private List<Post_x_category> post_x_category;

    public Category() {
        super();
    }

    public Category(long id_category, String name_category) {
        this.id_category = id_category;
        this.name_category = name_category;
    }

    public Category(String name_category) {
        this.name_category = name_category;
    }

    public long getId_category() {
        return id_category;
    }

    public void setId_category(long id_category) {
        this.id_category = id_category;
    }

    public String getName_category() {
        return name_category;
    }

    public void setName_category(String name_category) {
        this.name_category = name_category;
    }
}
