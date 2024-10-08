package com.example.blogging.dto;

import com.example.blogging.entity.User;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

public class RoleDto {

    private String name_role;

    private User user;


    public RoleDto() {
        super();
    }
    public RoleDto(String name_role, User user) {
        this.name_role = name_role;
        this.user = user;
    }

    public String getName_role() {
        return name_role;
    }

    public void setName_role(String name_role) {
        this.name_role = name_role;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
