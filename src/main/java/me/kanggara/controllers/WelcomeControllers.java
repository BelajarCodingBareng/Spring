package me.kanggara.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class WelcomeControllers {

    @GetMapping
    public String welcome() {
        return "Welcome to Spring Boot by KAnggara";
    }
}
