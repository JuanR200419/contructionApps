package com.example.blogging.Repository;

import com.example.blogging.entity.Post_x_category;
import com.example.blogging.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
