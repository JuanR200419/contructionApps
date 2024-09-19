package com.example.blogging.Repository;

import com.example.blogging.entity.Post_x_category;
import com.example.blogging.entity.Post_x_tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Post_x_tag_Repository  extends JpaRepository<Post_x_tag, Long> {
}
