package com.example.blogging.dto;

import com.example.blogging.entity.Comment;
import com.example.blogging.entity.Follow;
import com.example.blogging.entity.Post;
import com.example.blogging.entity.Role;
import jakarta.persistence.*;

import java.util.List;

public class UserDto {

    private String nickname;

    private String full_name;

    private String phone_number;

    private String email;

    private String password;

    private List<Post> post;

    private List<Comment> comment;

    private Role role;

    private List<Follow> followings;

    private List<Follow> followers;

    public UserDto() {
        super();
    }

    public UserDto(String nickname, String full_name, String phone_number, String email, String password, List<Post> post, List<Comment> comment, Role role, List<Follow> followings, List<Follow> followers) {
        this.nickname = nickname;
        this.full_name = full_name;
        this.phone_number = phone_number;
        this.email = email;
        this.password = password;
        this.post = post;
        this.comment = comment;
        this.role = role;
        this.followings = followings;
        this.followers = followers;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Post> getPost() {
        return post;
    }

    public void setPost(List<Post> post) {
        this.post = post;
    }

    public List<Comment> getComment() {
        return comment;
    }

    public void setComment(List<Comment> comment) {
        this.comment = comment;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<Follow> getFollowings() {
        return followings;
    }

    public void setFollowings(List<Follow> followings) {
        this.followings = followings;
    }

    public List<Follow> getFollowers() {
        return followers;
    }

    public void setFollowers(List<Follow> followers) {
        this.followers = followers;
    }
}
