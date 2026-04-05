package com.example.first;

import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppArgsRunner implements ApplicationRunner{
    @Override
    public void run(org.springframework.boot.ApplicationArguments args) throws Exception {
        System.out.println("App Args Runner is running!");
    }
}
