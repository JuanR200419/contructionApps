package com.example.blogging.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tags")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_tag;

    @Column(name = "name_tag")
    private String name_tag;

    @OneToMany(mappedBy = "tag", cascade = CascadeType.PERSIST)
    private List<Post_x_tag> post_x_tag;

    public Tag() {
        super();
    }

    public Tag(long id_tag, String name_tag, List<Post_x_tag> post_x_tag) {
        this.id_tag = id_tag;
        this.name_tag = name_tag;
        this.post_x_tag = post_x_tag;
    }

    public Tag(String name_tag, List<Post_x_tag> post_x_tag) {
        this.name_tag = name_tag;
        this.post_x_tag = post_x_tag;
    }

    public long getId_tag() {
        return id_tag;
    }

    public void setId_tag(long id_tag) {
        this.id_tag = id_tag;
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
