package com.ecommerce.user_service.controller;

import com.ecommerce.user_service.dto.UserRequest;
import com.ecommerce.user_service.dto.UserResponse;
import com.ecommerce.user_service.service.UserServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService){
        this.userService=userService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponse createUser(@RequestBody UserRequest request){
        return userService.createUser(request);
    }

}
