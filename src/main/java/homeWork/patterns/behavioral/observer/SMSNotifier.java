package homeWork.patterns.behavioral.observer;

public class SMSNotifier implements AlarmObserver {

    @Override
    public void alarmTriggered(String message) {
        System.out.println("СМС отправлено " + message);
    }

    @Override
    public void alarmDeactivated() {
        System.out.println("СМС отправлено - сигнализация отключена");
    }
}
