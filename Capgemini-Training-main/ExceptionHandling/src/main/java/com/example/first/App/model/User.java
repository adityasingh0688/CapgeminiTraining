package com.example.first.App.model;
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

public class User {
    private int id;
    private String name;
    private String email;

    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
