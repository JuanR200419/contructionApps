package com.example.blogging.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.blogging.repository.FollowRepository;
import com.example.blogging.dto.FollowDto;
import com.example.blogging.entity.Follow;

import java.util.List;
import java.util.Optional;

@Service
public class FollowService {

    @Autowired
    private FollowRepository followRepository;

    public List<Follow> findAll() {
        return followRepository.findAll();
    }

    public Optional<Follow> findById(Long id) {
        return followRepository.findById(id);
    }

    public boolean deleteFollow(Long id) {
        followRepository.deleteById(id);
        return true;
    }

    public Follow searchFollow(Long id) {
        return followRepository.findById(id).orElse(null);
    }

    public Follow createFollow(FollowDto followDto) {
        Follow followInfo = new Follow();
        followInfo.setUser_following(followDto.getUser_following());
        followInfo.setUser_follower(followDto.getUser_follower());
        return followRepository.save(followInfo);
    }

    public boolean updateFollow(Long id, FollowDto followDto) {
        Optional<Follow> optionalFollow = followRepository.findById(id);
        if (optionalFollow.isPresent()) {
            Follow followToUpdate = optionalFollow.get();
            followToUpdate.setUser_following(followDto.getUser_following());
            followToUpdate.setUser_follower(followDto.getUser_follower());
            followRepository.save(followToUpdate);
            return true;
        } else {
            return false;
        }
    }
}
