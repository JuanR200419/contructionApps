package com.example.blogging.Repository;

import com.example.blogging.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository  extends JpaRepository<Comment, Long> {
}
