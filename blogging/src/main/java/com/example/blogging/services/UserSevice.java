package com.example.blogging.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.blogging.repository.UserRepository;
import com.example.blogging.dto.UserDto;
import com.example.blogging.entity.User;

import java.util.List;
import java.util.Optional;

@Service
public class UserSevice {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    public boolean deleteUser(Long id) {
        userRepository.deleteById(id);
        return true;
    }

    public Optional<User> findByNickname(String nickname) {
        return userRepository.findByNickname(nickname);
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

            userRepository.save(userToUpdate);
            return true;
        } else {
            return false;
        }
    }
}
