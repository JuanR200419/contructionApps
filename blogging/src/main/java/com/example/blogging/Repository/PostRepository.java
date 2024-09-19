package com.example.blogging.Repository;

import com.example.blogging.entity.Post;
import com.example.blogging.entity.Post_x_category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
