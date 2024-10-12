package com.example.blogging.dto;

import com.example.blogging.entity.User;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class FollowDto {

    private User user_following;
    private User user_follower;

     public FollowDto() {
         super();
     }

    public FollowDto(User user_following, User user_follower) {
        this.user_following = user_following;
        this.user_follower = user_follower;
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
