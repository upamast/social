package com.example.social.service;


import com.example.social.model.User;
import com.example.social.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getUser() {
        return (List<User>) userRepository.getUser();
    }

    public User save(User user) {
        return userRepository.save(user);
    }
}
