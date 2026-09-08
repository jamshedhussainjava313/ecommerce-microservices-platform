package com.ecommerce.user_service.service;

import com.ecommerce.user_service.dto.UserRequest;
import com.ecommerce.user_service.dto.UserResponse;
import com.ecommerce.user_service.entity.User;

import java.util.List;

public interface UserService {

    UserResponse createUser(UserRequest request);

    UserResponse getUserById(Long id);

    List<User> getAllUsers();

    void deleteUser(Long id);
}
