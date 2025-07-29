package homeWork.patterns.structural.dekorator;

public class EmailNotification extends NotificationDecorator {

    public EmailNotification(Notification notification) {
        super(notification);
    }

    @Override
    public void send() {
        super.send();
        System.out.println("Добавлена отправка по EMail: письмо доставлено");
    }
}
