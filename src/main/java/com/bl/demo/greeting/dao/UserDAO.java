package com.bl.demo.greeting.dao;

import com.bl.demo.greeting.model.User;

import java.util.List;

public interface UserDAO {
    List<User> get();
    User get(int id);
    void save(User user);
    void delete(int id);
}
