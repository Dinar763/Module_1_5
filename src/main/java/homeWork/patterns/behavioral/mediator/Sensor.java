package homeWork.patterns.behavioral.mediator;

public abstract class Sensor {
    protected GarageAlarmMediator mediator;
    protected String sensorType;

    public Sensor(GarageAlarmMediator mediator, String sensorType) {
        this.mediator = mediator;
        this.sensorType = sensorType;
    }

    public String getSensorType() {
        return sensorType;
    }

    public abstract void trigger();
}
