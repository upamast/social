package com.example.social.repository;

import com.example.social.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public User getUser() {
        User user = new User("Shegufta","Texas","45678" );
        return user;
    }
}
