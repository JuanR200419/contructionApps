package com.example.blogging.Repository;

import com.example.blogging.entity.Comment;
import com.example.blogging.entity.Follow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FollowRepository extends JpaRepository<Follow, Long> {
}
