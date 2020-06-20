package com.bl.demo.greeting.service;

import com.bl.demo.greeting.dto.UserDTO;
import com.bl.demo.greeting.model.User;

import java.util.List;

public interface UserService {

    List<User> get();
    User save (UserDTO user);
    String delete(Integer id);
    User update(Integer id,UserDTO userDTO);

}
