package com.ecommerce.user_service.dto;


public class UserRequest {

    private String name;
    private String email;


    //setter and getter
    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public String getEmail(){
        return email;
    }
}
