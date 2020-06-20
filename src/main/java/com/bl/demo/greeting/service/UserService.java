package com.bl.demo.greeting.service;

import com.bl.demo.greeting.dto.UserDTO;
import com.bl.demo.greeting.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> get();
    User save (UserDTO user);
    void delete(Integer id);
    User update(Integer id, UserDTO userDTO);
}
