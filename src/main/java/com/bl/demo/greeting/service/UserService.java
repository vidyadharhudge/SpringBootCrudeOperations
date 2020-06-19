package com.bl.demo.greeting.service;

import com.bl.demo.greeting.model.User;

import java.util.List;

public interface UserService {
    List<User> get();
    User get(int id);
    User save(User user);
    void delete(int id);
}
