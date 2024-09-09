package com.example.blogging.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_user;

    @Column(name = "nickname")
    private String nickname;

    @Column(name = "full_name")
    private String full_name;

    @Column(name = "phone_number")
    private String phone_number;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @OneToMany(mappedBy = "user", cascade = CascadeType.PERSIST)
    private List<Post> post;

    @OneToMany(mappedBy = "user", cascade = CascadeType.PERSIST)
    private List<Comment> comment;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_role", referencedColumnName = "id_role")
    private Role role;

    @OneToMany(mappedBy = "user", cascade = CascadeType.PERSIST)
    private List<Follow> follow;

    public User() {
        super();
    }

    public User(long id_user, String nickname, String full_name, String phone_number, String email, String password, List<Post> post, List<Comment> comment, Role role, List<Follow> follow) {
        this.id_user = id_user;
        this.nickname = nickname;
        this.full_name = full_name;
        this.phone_number = phone_number;
        this.email = email;
        this.password = password;
        this.post = post;
        this.comment = comment;
        this.role = role;
        this.follow = follow;
    }

    public User(String nickname, String full_name, String phone_number, String email, String password, List<Post> post, List<Comment> comment, Role role, List<Follow> follow) {
        this.nickname = nickname;
        this.full_name = full_name;
        this.phone_number = phone_number;
        this.email = email;
        this.password = password;
        this.post = post;
        this.comment = comment;
        this.role = role;
        this.follow = follow;
    }

    public long getId_user() {
        return id_user;
    }

    public void setId_user(long id_user) {
        this.id_user = id_user;
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

    public List<Follow> getFollow() {
        return follow;
    }

    public void setFollow(List<Follow> follow) {
        this.follow = follow;
    }
}
