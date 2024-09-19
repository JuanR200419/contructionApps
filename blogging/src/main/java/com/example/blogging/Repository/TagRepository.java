package com.example.blogging.Repository;

import com.example.blogging.entity.Post_x_category;
import com.example.blogging.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Long> {
}
