package com.bl.demo.greeting.service;
import com.bl.demo.greeting.dto.UserDTO;
import com.bl.demo.greeting.model.User;
import com.bl.demo.greeting.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> get() {
        return userRepository.findAll();
    }

    @Override
    public User save(UserDTO userDTO) {
        User user=new User(userDTO);
        return userRepository.save(user);
    }

    @Override
    public void delete(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    public User update(Integer id,UserDTO userDTO) {
        User userDTO1=userRepository.findById(id).get();
       String u1=userDTO.getUserName();
       String u2=userDTO.getPassword();
       userDTO1.setPassword(u2);
       userDTO1.setUserName(u1);
       return userRepository.save(userDTO1);
    }
}

