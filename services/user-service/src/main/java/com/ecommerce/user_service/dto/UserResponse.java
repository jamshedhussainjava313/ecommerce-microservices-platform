package com.ecommerce.user_service.dto;

public class UserResponse {

    private String message;
    private String name;
    private String email;

    public UserResponse(String message,String name,String email){
        this.message=message;
        this.name=name;
        this.email=email;
    }

    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getMessage(){
        return message;
    }
}
