package homeWork.patterns.behavioral.observer;

public class GarageAlarmController implements GarageAlarmMediator {
    private ReedSwitch reedSwitch;
    private VolumeSensor volumeSensor;
    private Alarm alarm;
    private boolean alarmActive = false;

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
                alarmActive = true;
                alarm.activate();
                System.out.println("Тревога! Обнаружено проникновение!");
            } else {
                System.out.println("Дверь открыта, но движение не обнаружено");
            }
        } else if (sensor instanceof VolumeSensor) {
            if (reedSwitch.isDoorOpen()) {
                alarmActive = true;
                alarm.activate();
                System.out.println("Тревога! Обнаружено движение при открытой двери!");
            } else {
                System.out.println("Обнаружено движение, но дверь закрыта");
            }
        }
    }

    public void deactivateAlarm() {
        if (alarmActive) {
            alarmActive = false;
            alarm.deactivated();
        }
    }
}
