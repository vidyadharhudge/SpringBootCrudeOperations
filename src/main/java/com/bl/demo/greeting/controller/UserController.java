package com.bl.demo.greeting.controller;
import com.bl.demo.greeting.dto.UserDTO;
import com.bl.demo.greeting.model.User;
import com.bl.demo.greeting.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/information")
    public List<User>get(){
        return userService.get();
    }

    @PostMapping("/add")
    public User save(@RequestBody UserDTO user){
        return userService.save(user);

    }

    @PutMapping("/update/{id}")
    public User save(@PathVariable (name = "id")Integer id,@RequestBody UserDTO user){
        return userService.update(id,user);
    }

    @DeleteMapping("/delete/{id}")
    public String save(@PathVariable(name = "id")Integer id) {
         return userService.delete(id);
    }
}
