package com.portfolio.controller;

import org.springframework.web.bind.annotation.*;
import com.portfolio.repository.UserRepository;
import com.portfolio.model.User;
import java.util.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return repository.save(user);
    }
}
