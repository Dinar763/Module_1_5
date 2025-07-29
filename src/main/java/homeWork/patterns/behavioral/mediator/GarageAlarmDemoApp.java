package homeWork.patterns.behavioral.mediator;

public class GarageAlarmDemoApp {
    public static void main(String[] args) {
        GarageAlarmController controller = new GarageAlarmController();

        ReedSwitch reedSwitch = new ReedSwitch(controller);
        VolumeSensor volumeSensor = new VolumeSensor(controller);
        Alarm alarm = new Alarm();

        controller.setReedSwitch(reedSwitch);
        controller.setVolumeSensor(volumeSensor);
        controller.setAlarm(alarm);

        System.out.println("Открытие двери");
        reedSwitch.trigger();

        System.out.println("Срабатывание датчика движения");
        volumeSensor.trigger();


    }
}
