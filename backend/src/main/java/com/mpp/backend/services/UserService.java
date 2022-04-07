package com.mpp.backend.services;

import com.mpp.backend.dto.UserDTO;
import com.mpp.backend.exception.CustomException;
import com.mpp.backend.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(Long userId);
    User findByUsername(String username);
    User createUser(User user) throws CustomException;
    User registerUser(UserDTO userDTO) throws CustomException;
}
