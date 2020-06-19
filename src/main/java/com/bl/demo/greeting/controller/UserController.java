package com.bl.demo.greeting.controller;

import com.bl.demo.greeting.model.User;
import com.bl.demo.greeting.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<User>get(){
        return userService.get();
    }

}
