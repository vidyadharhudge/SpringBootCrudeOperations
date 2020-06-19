package com.bl.demo.greeting.service;
import com.bl.demo.greeting.repository.UserRepository;
import com.bl.demo.greeting.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userDAO;

    @Transactional
    @Override
    public List<User> get() {
        return userDAO.get();
    }

    @Transactional
    @Override
    public User get(int id) {
        return userDAO.get(id);
    }

    @Transactional
    @Override
    public User save(User user) {
        userDAO.save(user);
        return user;
    }

    @Transactional
    @Override
    public void delete(int id) {
    }

}
