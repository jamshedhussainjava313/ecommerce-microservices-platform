package com.ecommerce.user_service.service;

import com.ecommerce.user_service.dto.UserRequest;
import com.ecommerce.user_service.dto.UserResponse;
import com.ecommerce.user_service.entity.User;
import com.ecommerce.user_service.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    public UserResponse createUser(UserRequest request){
        User user=new User(request.getName(), request.getEmail());
        User savedUser=userRepository.save(user);
        return new UserResponse("user created successfully", savedUser.getName(), savedUser.getEmail());
    }

    @Override
    public UserResponse getUserById(Long id) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return List.of();
    }

    @Override
    public void deleteUser(Long id) {

    }


}
