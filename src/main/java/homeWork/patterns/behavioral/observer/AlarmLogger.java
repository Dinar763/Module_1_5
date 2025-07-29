package homeWork.patterns.behavioral.observer;

import java.util.Date;

public class AlarmLogger implements AlarmObserver {
    @Override
    public void alarmTriggered(String message) {
        System.out.println("Логгер " + message + "[время " + new Date() + "]");
    }

    @Override
    public void alarmDeactivated() {
        System.out.println("Деактивация системы!   " + "[время " + new Date() + "]");
    }
}
