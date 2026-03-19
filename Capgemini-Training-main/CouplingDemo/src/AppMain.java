import LooseCoupling.EmailNotificationService;
import LooseCoupling.NotificationService;
//import LooseCoupling.UserService;
import LooseCoupling.SMSNotificationService;
import TightCoupling.UserService;


public class AppMain {
    public static void main(String[] args) {
        //Tight Coupling
        UserService userService = new UserService();
        userService.notifyuser(" __Order PLaced");

        //Loose Coupling
        NotificationService emailService=new EmailNotificationService();
        LooseCoupling.UserService userServiceLoose=new LooseCoupling.UserService(emailService);//Using constructor injection
        userServiceLoose.notifyuser("Order Processed");

        NotificationService smsService=new SMSNotificationService();//Using constructor injection
        LooseCoupling.UserService userServiceLoose2=new LooseCoupling.UserService(smsService);
        userServiceLoose2.notifyuser("Order Shipped");

        LooseCoupling.UserService userServiceLooseSetter= new LooseCoupling.UserService();//Using setter injection
        userServiceLooseSetter.setNotificationService(emailService);
        userServiceLooseSetter.notifyuser("Order Delivered");
    }
}
