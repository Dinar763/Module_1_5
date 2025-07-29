package homeWork.patterns.behavioral.observer;

public interface AlarmObserver {
    void alarmTriggered(String message);
    void alarmDeactivated();
}
