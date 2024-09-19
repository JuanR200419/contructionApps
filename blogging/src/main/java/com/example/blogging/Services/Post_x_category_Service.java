package com.example.blogging.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.blogging.Repository.Post_x_category_Repository;
import com.example.blogging.dto.Post_x_category_Dto;
import com.example.blogging.entity.Post_x_category;

import java.util.Optional;

@Service
public class Post_x_category_Service {

    @Autowired
    private Post_x_category_Repository post_x_category_Repository;

    public boolean deletePost_x_category(Long id) {
        post_x_category_Repository.deleteById(id);
        return true;
    }

    public Post_x_category searchPost_x_category(Long id) {
        return post_x_category_Repository.findById(id).orElse(null);
    }

    public Post_x_category createPost_x_category(Post_x_category_Dto post_x_category_Dto) {
        Post_x_category post_x_categoryInfo = new Post_x_category();
        post_x_categoryInfo.setCategory(post_x_category_Dto.getCategory());
        post_x_categoryInfo.setPost(post_x_category_Dto.getPost());
        return post_x_category_Repository.save(post_x_categoryInfo);
    }

    public boolean updatePost_x_category(Long id, Post_x_category_Dto post_x_category_Dto) {
        Optional<Post_x_category> optionalPost_x_category = post_x_category_Repository.findById(id);
        if (optionalPost_x_category.isPresent()) {
            Post_x_category post_x_categoryToUpdate = optionalPost_x_category.get();
            post_x_categoryToUpdate.setCategory(post_x_category_Dto.getCategory());
            post_x_categoryToUpdate.setPost(post_x_category_Dto.getPost());
            post_x_category_Repository.save(post_x_categoryToUpdate);
            return true;
        } else {
            return false;
        }
    }
}
