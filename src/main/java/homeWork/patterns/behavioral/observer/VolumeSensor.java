package homeWork.patterns.behavioral.observer;



public class VolumeSensor extends Sensor {
    private boolean volumeDetected = false;

    public VolumeSensor(GarageAlarmMediator mediator) {
        super(mediator, "датчик объема");
    }

    public boolean isVolumeDetected() {
        return volumeDetected;
    }

    @Override
    public void trigger() {
        volumeDetected = true;
        System.out.println( "обнаружено движение");
        mediator.sensorTriggered(this);
    }
}
