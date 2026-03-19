package com.example.demo;

import com.example.LooseCoupling.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("applicationBeanContext.xml");
        GreetingService greetingService= (GreetingService) context.getBean("myBean");
        greetingService.sayHello("Spring");

        UserService userService= (UserService) context.getBean("UserServiceEmail");
        userService.notifyuser("Dear Sir/Madam");

        UserService userService1= (UserService) context.getBean("UserServiceSMS");
        userService1.notifyuser("Good Morning");
    }
}
