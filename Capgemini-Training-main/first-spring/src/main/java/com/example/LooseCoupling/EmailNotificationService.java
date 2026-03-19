package com.example.LooseCoupling;

public class EmailNotificationService implements NotificationService{
    @Override
    public void send(String message) {
        // Code to send an email notification
        System.out.println("Email notification sent: " + message);
    }
}
