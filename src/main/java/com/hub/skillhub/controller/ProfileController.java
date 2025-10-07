package com.hub.skillhub.controller;

import com.hub.skillhub.model.User;
import com.hub.skillhub.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class ProfileController {

    private final UserService userService;

    public ProfileController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/profile")
    public String profile(Model model, Principal principal) {
        // Get logged-in user's email
        String email = principal.getName();

        // Fetch user from database
        User user = userService.findByEmail(email);

        // Add user object to Thymeleaf model
        model.addAttribute("user", user);

        return "profile";  // points to profile.html
    }
}
