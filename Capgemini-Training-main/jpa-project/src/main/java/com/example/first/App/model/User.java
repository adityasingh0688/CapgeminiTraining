package com.example.first.App.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//POJO class are the class which have only data and getter setter method and constructor,
//POJO stands for Plain Old Java Object
//👉 It’s just a simple Java class that:
//Does not depend on any framework
//Has basic properties (variables)
//Uses getters & setters
//Why is it called “Plain Old”?
//Because:
//No annotations (like @Component, @Entity, etc.)
//No inheritance from framework classes
//No special restrictions
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;

    public User() {
    }

    public User(Integer id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
