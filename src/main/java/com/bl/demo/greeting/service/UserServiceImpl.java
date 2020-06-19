package com.bl.demo.greeting.service;

import com.bl.demo.greeting.dao.UserDAO;
import com.bl.demo.greeting.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Transactional
    @Override
    public List<User> get() {
        return userDAO.get();
    }

    @Transactional
    @Override
    public User get(int id) {
        return null;
    }

    @Transactional
    @Override
    public void save(User user) {

    }

    @Transactional
    @Override
    public void delete(int id) {

    }
}
