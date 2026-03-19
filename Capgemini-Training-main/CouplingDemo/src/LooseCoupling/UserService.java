package LooseCoupling;

public class UserService {
    private NotificationService notificationService;
    public UserService(NotificationService notificationService){
        this.notificationService=notificationService;
    }
    public UserService() {
    }
    public void notifyuser(String message) {
        notificationService.send("Notification Hello " + message);
    }

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
}
