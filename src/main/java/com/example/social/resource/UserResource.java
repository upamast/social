package com.example.social.resource;

import com.example.social.model.User;
import com.example.social.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/users")

public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping("/me")
    public User getUser() {
        return (User) userService.getUser();
    }

    @GetMapping("/me")
    public List<User>me() {
        return userService.getUser();
        // User u = new User("Shegufta", "Texas", "45678");
        // return u
    }

    @PostMapping
    public User saveUser(@RequestBody User user) {
        return userService.save(user);
    }

}
