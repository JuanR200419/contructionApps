package com.example.blogging.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.blogging.repository.PostRepository;
import com.example.blogging.dto.PostDto;
import com.example.blogging.entity.Post;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<Post> findAll() {
        return postRepository.findAll();
    }

    public Optional<Post> findById(Long id) {
        return postRepository.findById(id);
    }

    public boolean deletePost(Long id) {
        postRepository.deleteById(id);
        return true;
    }

    public Post searchPost(Long id) {
        return postRepository.findById(id).orElse(null);
    }

    public Post createPost(PostDto postDto) {
        Post postInfo = new Post();
        postInfo.setTitle(postDto.getTitle());
        postInfo.setText(postDto.getText());
        postInfo.setDate_publication(postDto.getDate_publication());
        postInfo.setReactions(postDto.getReactions());
        return postRepository.save(postInfo);
    }

    public boolean updatePost(Long id, PostDto postDto) {
        Optional<Post> optionalPost = postRepository.findById(id);
        if (optionalPost.isPresent()) {
            Post postToUpdate = optionalPost.get();
            postToUpdate.setTitle(postDto.getTitle());
            postToUpdate.setText(postDto.getText());
            postToUpdate.setDate_publication(postDto.getDate_publication());
            postToUpdate.setReactions(postDto.getReactions());
            postRepository.save(postToUpdate);
            return true;
        } else {
            return false;
        }
    }
}
