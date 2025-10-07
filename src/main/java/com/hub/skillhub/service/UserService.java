package com.hub.skillhub.service;

import com.hub.skillhub.model.User;
import com.hub.skillhub.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

@Service
public class UserService {

    private final UserRepository repo;
    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(); // no external injection

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public User register(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        return repo.save(user);
    }

    public User findByEmail(String email) {
        return repo.findByEmail(email).orElse(null);
    }

    @PostConstruct
    public void init() {
        if (repo.findAll().isEmpty()) {
            User user = new User();
            user.setName("Shivani");
            user.setEmail("shiv@example.com");
            user.setPassword("password123");  // will be hashed in register()
            user.setRole("USER");
            register(user);
            System.out.println("Test user created: shiv@example.com / password123");
        }
    }
}
