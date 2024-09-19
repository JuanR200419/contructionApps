package com.example.blogging.Repository;

import com.example.blogging.entity.Post_x_category;
import com.example.blogging.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
