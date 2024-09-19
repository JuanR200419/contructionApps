package com.example.blogging.Services;

import com.example.blogging.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSevice {
@Autowired
UserRepository userRepository;


}
