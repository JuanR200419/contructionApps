package com.example.blogging.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "follows")
public class Follow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_follow;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User id_user_followed;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User id_user_follower;

    public Follow() {
        super();
    }

    public Follow(long id_follow, User id_user_followed, User id_user_follower) {
        this.id_follow = id_follow;
        this.id_user_followed = id_user_followed;
        this.id_user_follower = id_user_follower;
    }

    public Follow(User id_user_followed, User id_user_follower) {
        this.id_user_followed = id_user_followed;
        this.id_user_follower = id_user_follower;
    }

    public long getId_follow() {
        return id_follow;
    }

    public void setId_follow(long id_follow) {
        this.id_follow = id_follow;
    }

    public User getId_user_followed() {
        return id_user_followed;
    }

    public void setId_user_followed(User id_user_followed) {
        this.id_user_followed = id_user_followed;
    }

    public User getId_user_follower() {
        return id_user_follower;
    }

    public void setId_user_follower(User id_user_follower) {
        this.id_user_follower = id_user_follower;
    }
}
