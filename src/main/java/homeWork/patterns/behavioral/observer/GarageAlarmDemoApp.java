package homeWork.patterns.behavioral.observer;

public class GarageAlarmDemoApp {
    public static void main(String[] args) {
        GarageAlarmController controller = new GarageAlarmController();
        Alarm alarm = new Alarm();

        AlarmObserver logger = new AlarmLogger();
        AlarmObserver smsNotifier = new SMSNotifier();

        alarm.addObserver(logger);
        alarm.addObserver(smsNotifier);

        ReedSwitch reedSwitch = new ReedSwitch(controller);
        VolumeSensor volumeSensor = new VolumeSensor(controller);

        controller.setReedSwitch(reedSwitch);
        controller.setVolumeSensor(volumeSensor);
        controller.setAlarm(alarm);

        System.out.println("1. Открываем дверь (без движения)");
        reedSwitch.trigger();

        System.out.println("\n2. Обнаруживаем движение при открытой двери");
        volumeSensor.trigger();

        System.out.println("\n3. Отключаем сигнализацию");
        controller.deactivateAlarm();

        System.out.println("\n4. Обнаруживаем движение при закрытой двери");
        reedSwitch.trigger();
        volumeSensor.trigger();

    }
}
