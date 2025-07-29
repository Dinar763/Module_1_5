package homeWork.patterns.structural.dekorator;

public class MainApp {
    public static void main(String[] args) {
        Notification notification = new BasicNotification();

        notification = new EmailNotification(notification);
        notification = new SmsNotification(notification);
        notification = new PushNotification(notification);

        notification.send();
    }
}
