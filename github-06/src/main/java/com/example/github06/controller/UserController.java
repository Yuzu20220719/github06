package com.example.github06.controller;

import com.example.github06.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("getUser")
    public User getUser(){
        return new User("yuzu","xiantai","pool");
    }
}
