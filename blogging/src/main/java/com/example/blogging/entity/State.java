package com.example.blogging.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "states")
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_state;

    @Column(name = "name_state")
    private String name_state;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_post", referencedColumnName = "id_post")
    private Post post;

    public State() {
        super();
    }

    public State(long id_state, String name_state, Post post) {
        this.id_state = id_state;
        this.name_state = name_state;
        this.post = post;
    }

    public State(String name_state, Post post) {
        this.name_state = name_state;
        this.post = post;
    }

    public long getId_state() {
        return id_state;
    }

    public void setId_state(long id_state) {
        this.id_state = id_state;
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
