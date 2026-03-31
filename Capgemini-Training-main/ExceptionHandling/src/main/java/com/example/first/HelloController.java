package com.example.first;

import com.example.first.App.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/apple")//request mapping is used to map the url to the controller, it can be used at class level and method level, if it is used at class level then it will be the base url for all the methods in that class, if it is used at method level then it will be the url for that method only
public class HelloController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

//    @GetMapping("/user")
    @RequestMapping(value = "/api",method =RequestMethod.GET)//another way of writing @GetMapping
    public User getUser() {
        return new User(1, "John Doe", "johnDoe");
    }
}
