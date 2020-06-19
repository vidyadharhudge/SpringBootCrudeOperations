package com.bl.demo.greeting.controller;

import com.bl.demo.greeting.model.User;
import com.bl.demo.greeting.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/user")
    public User save(@RequestBody User user){
         userService.save(user);
         return user;
    }

    @GetMapping("/user/{id}")
    public User get(@PathVariable int id){
        return userService.get(id);
    }


}
