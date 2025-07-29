package homeWork.patterns.behavioral.mediator;

public class ReedSwitch extends Sensor {
    private boolean doorOpen = false;

    public ReedSwitch(GarageAlarmMediator mediator) {
        super(mediator, "Датчик двери");
    }

    public boolean isDoorOpen() {
        return doorOpen;
    }

    @Override
    public void trigger() {
        doorOpen = !doorOpen;
        System.out.println(doorOpen ? "Дверь открыта" : "Дверь закрыта");
        mediator.sensorTriggered(this);
    }
}
