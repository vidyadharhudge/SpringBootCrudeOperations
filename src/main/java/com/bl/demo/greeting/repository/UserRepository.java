package com.bl.demo.greeting.repository;

import com.bl.demo.greeting.model.User;

import java.util.List;

public interface UserRepository {
    List<User> get();
    User get(int id);
    void save(User user);
    void delete(int id);
}
