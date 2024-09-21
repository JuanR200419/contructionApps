package com.example.blogging.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.blogging.repository.Post_x_tag_Repository;
import com.example.blogging.dto.Post_x_tag_Dto;
import com.example.blogging.entity.Post_x_tag;

import java.util.List;
import java.util.Optional;

@Service
public class Post_x_tag_Service {

    @Autowired
    private Post_x_tag_Repository post_x_tag_Repository;

    public List<Post_x_tag> findAll() {
        return post_x_tag_Repository.findAll();
    }

    public Optional<Post_x_tag> findById(Long id) {
        return post_x_tag_Repository.findById(id);
    }

    public boolean deletePost_x_tag(Long id) {
        post_x_tag_Repository.deleteById(id);
        return true;
    }

    public Post_x_tag searchPost_x_tag(Long id) {
        return post_x_tag_Repository.findById(id).orElse(null);
    }

    public Post_x_tag createPost_x_tag(Post_x_tag_Dto post_x_tag_Dto) {
        Post_x_tag post_x_tagInfo = new Post_x_tag();
        post_x_tagInfo.setPost(post_x_tag_Dto.getPost());
        post_x_tagInfo.setTag(post_x_tag_Dto.getTag());
        return post_x_tag_Repository.save(post_x_tagInfo);
    }

    public boolean updatePost_x_tag(Long id, Post_x_tag_Dto post_x_tag_Dto) {
        Optional<Post_x_tag> optionalPost_x_tag = post_x_tag_Repository.findById(id);
        if (optionalPost_x_tag.isPresent()) {
            Post_x_tag post_x_tagToUpdate = optionalPost_x_tag.get();
            post_x_tagToUpdate.setPost(post_x_tag_Dto.getPost());
            post_x_tagToUpdate.setTag(post_x_tag_Dto.getTag());
            post_x_tag_Repository.save(post_x_tagToUpdate);
            return true;
        } else {
            return false;
        }
    }
}
