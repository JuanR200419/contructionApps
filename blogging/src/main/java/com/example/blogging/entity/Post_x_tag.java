package com.example.blogging.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "post_x_tags")
public class Post_x_tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_post_x_tag;

    @ManyToOne
    @JoinColumn(name = "id_post")
    private Post post;

    @ManyToOne
    @JoinColumn(name = "id_tag")
    private Tag tag;

    public Post_x_tag() {
        super();
    }

    public Post_x_tag(long id_post_x_tag, Post post, Tag tag) {
        this.id_post_x_tag = id_post_x_tag;
        this.post = post;
        this.tag = tag;
    }

    public Post_x_tag(Post post, Tag tag) {
        this.post = post;
        this.tag = tag;
    }

    public long getId_post_x_tag() {
        return id_post_x_tag;
    }

    public void setId_post_x_tag(long id_post_x_tag) {
        this.id_post_x_tag = id_post_x_tag;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }
}
