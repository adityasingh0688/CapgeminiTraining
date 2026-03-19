package TightCoupling;

public class UserService {
   NotificationService notificationService=new NotificationService();
    public void notifyuser(String message) {
        // Code to notify the user
        notificationService.send("Notification Hello" + message);
    }
}
