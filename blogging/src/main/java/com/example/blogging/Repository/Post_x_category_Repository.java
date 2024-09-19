package com.example.blogging.Repository;

import com.example.blogging.entity.Comment;
import com.example.blogging.entity.Post_x_category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Post_x_category_Repository extends JpaRepository<Post_x_category, Long> {
}
