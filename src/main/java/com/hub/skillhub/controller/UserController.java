package com.hub.skillhub.controller;

import com.hub.skillhub.model.User;
import com.hub.skillhub.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {
    private final UserService service;
    public UserController(UserService service) { this.service = service; }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute User user, Model model) {
        service.register(user);
        model.addAttribute("msg", "Registration successful! Please log in.");
        return "login";
    }
}
