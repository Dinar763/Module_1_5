package homeWork.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Alarm {
    private List<AlarmObserver> observers = new ArrayList<>();

    public void addObserver(AlarmObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(AlarmObserver observer) {
        observers.remove(observer);
    }

    public void activate() {
        System.out.println("Сирена сработала!!!!ТРЕВОГА!!!");
        notifyObservers("Сирена сработала!!!!ТРЕВОГА!!!");
    }

    public void deactivated() {
        System.out.println("Сирена отключилась");
        notifyObserversDeactivated();
    }

    private void notifyObservers(String message) {
        for (AlarmObserver observer : observers) {
            observer.alarmTriggered(message);
        }
    }

    private void notifyObserversDeactivated() {
        for (AlarmObserver observer : observers) {
            observer.alarmDeactivated();
        }
    }
}
