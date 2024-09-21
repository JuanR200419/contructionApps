package com.example.blogging.repository;

import com.example.blogging.entity.Post_x_tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Post_x_tag_Repository  extends JpaRepository<Post_x_tag, Long> {
}
