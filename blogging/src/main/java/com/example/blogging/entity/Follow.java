package com.example.blogging.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "follows")
public class Follow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_follow;

    @ManyToOne
    @JoinColumn(name = "id_user_following", referencedColumnName = "id_user")
    private User user_following;

    @ManyToOne
    @JoinColumn(name = "id_user_follower", referencedColumnName = "id_user")
    private User user_follower;

    public Follow() {
        super();
    }

    public Follow(long id_follow, User user_following, User user_follower) {
        this.id_follow = id_follow;
        this.user_following = user_following;
        this.user_follower = user_follower;
    }

    public Follow(User user_following, User user_follower) {
        this.user_following = user_following;
        this.user_follower = user_follower;
    }

    public long getId_follow() {
        return id_follow;
    }

    public void setId_follow(long id_follow) {
        this.id_follow = id_follow;
    }

    public User getUser_following() {
        return user_following;
    }

    public void setUser_following(User user_following) {
        this.user_following = user_following;
    }

    public User getUser_follower() {
        return user_follower;
    }

    public void setUser_follower(User user_follower) {
        this.user_follower = user_follower;
    }
}
