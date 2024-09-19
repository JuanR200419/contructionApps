package com.example.blogging.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.blogging.Repository.UserRepository;
import com.example.blogging.dto.UserDto;
import com.example.blogging.entity.User;

import java.util.Optional;

@Service
public class UserSevice {

    @Autowired
    private UserRepository userRepository;

    public boolean deleteUser(Long id) {
        userRepository.deleteById(id);
        return true;
    }

    public User searchUser(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User createUser(UserDto userDto) {
        User userInfo = new User();
        userInfo.setNickname(userDto.getNickname());
        userInfo.setFull_name(userDto.getFull_name());
        userInfo.setPhone_number(userDto.getPhone_number());
        userInfo.setEmail(userDto.getEmail());
        userInfo.setPassword(userDto.getPassword());
        userInfo.setPost(userDto.getPost());
        userInfo.setComment(userDto.getComment());
        userInfo.setRole(userDto.getRole());
        userInfo.setFollowings(userDto.getFollowings());
        userInfo.setFollowers(userDto.getFollowers());

        return userRepository.save(userInfo);
    }

    public boolean updateUser(Long id, UserDto userDto) {
        Optional<User> optionalUser = userRepository.findById(id);

        if (optionalUser.isPresent()) {
            User userToUpdate = optionalUser.get();
            userToUpdate.setNickname(userDto.getNickname());
            userToUpdate.setFull_name(userDto.getFull_name());
            userToUpdate.setPhone_number(userDto.getPhone_number());
            userToUpdate.setEmail(userDto.getEmail());
            userToUpdate.setPassword(userDto.getPassword());
            userToUpdate.setPost(userDto.getPost());
            userToUpdate.setComment(userDto.getComment());
            userToUpdate.setRole(userDto.getRole());
            userToUpdate.setFollowings(userDto.getFollowings());
            userToUpdate.setFollowers(userDto.getFollowers());

            userRepository.save(userToUpdate);
            return true;
        } else {
            return false;
        }
    }
}
