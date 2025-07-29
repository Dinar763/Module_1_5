package homeWork.patterns.structural.dekorator;

public class PushNotification extends NotificationDecorator {

    public PushNotification(Notification notification) {
        super(notification);
    }

    @Override
    public void send() {
        super.send();
        System.out.println("Добавлена отправка Push-уведомлений: письмо доставлено");
    }
}
