package homeWork.patterns.behavioral.mediator;

public class GarageAlarmController implements GarageAlarmMediator {
    private ReedSwitch reedSwitch;
    private VolumeSensor volumeSensor;
    private Alarm alarm;

    public void setReedSwitch(ReedSwitch reedSwitch) {
        this.reedSwitch = reedSwitch;
    }

    public void setVolumeSensor(VolumeSensor volumeSensor) {
        this.volumeSensor = volumeSensor;
    }

    public void setAlarm(Alarm alarm) {
        this.alarm = alarm;
    }

    @Override
    public void sensorTriggered(Sensor sensor) {
        System.out.println("Контроллер получил сигнал от " + sensor.getSensorType());

        if (sensor instanceof ReedSwitch) {
            if (volumeSensor.isVolumeDetected()) {
                alarm.activate();
                System.out.println("Тревога! Обнаружено проникновение!");
            } else {
                System.out.println("Дверь открыта, но движение не обнаружено");
            }
        } else if (sensor instanceof VolumeSensor) {
            if (reedSwitch.isDoorOpen()) {
                alarm.activate();
                System.out.println("Тревога! Обнаружено движение при открытой двери!");
            } else {
                System.out.println("Обнаружен шум, но дверь закрыта");
            }
        }
    }
}
