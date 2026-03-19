package LooseCoupling;

public class SMSNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        // Code to send an email notification
        System.out.println("SMS notification sent: " + message);
    }
}
