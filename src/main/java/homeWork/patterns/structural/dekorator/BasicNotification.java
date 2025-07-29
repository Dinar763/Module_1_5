package homeWork.patterns.structural.dekorator;

public class BasicNotification implements Notification {
    @Override
    public void send() {
        System.out.println("Базовое уведомление: Сообщение отправлено");
    }
}
