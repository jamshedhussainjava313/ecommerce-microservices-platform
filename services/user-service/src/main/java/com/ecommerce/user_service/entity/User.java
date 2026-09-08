package com.ecommerce.user_service.entity;

import jakarta.persistence.*;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;

    public User(String name,String email){
        this.name=name;
        this.email=email;
    }

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
