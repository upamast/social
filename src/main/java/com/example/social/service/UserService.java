package com.example.social.service;


import com.example.social.model.User;
import com.example.social.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User getUser() {
        return userRepository.getUser();
    }

}
