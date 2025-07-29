package homeWork.patterns.structural.dekorator;

public class SmsNotification extends NotificationDecorator {

    public SmsNotification(Notification notification) {
        super(notification);
    }

    @Override
    public void send() {
        super.send();
        System.out.println("Добавлена отправка по SMS: письмо доставлено");
    }
}
