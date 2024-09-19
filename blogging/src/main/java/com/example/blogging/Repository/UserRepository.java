package com.example.blogging.Repository;

import com.example.blogging.entity.Post_x_category;
import com.example.blogging.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
