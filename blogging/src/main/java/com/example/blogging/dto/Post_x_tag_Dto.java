package com.example.blogging.dto;

import com.example.blogging.entity.Post;
import com.example.blogging.entity.Tag;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Post_x_tag_Dto {

    private Post post;

    private Tag tag;

    public Post_x_tag_Dto() {
        super();
    }

    public Post_x_tag_Dto(Post post, Tag tag) {
        this.post = post;
        this.tag = tag;
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
