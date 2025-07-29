package homeWork.patterns.structural.adapter;

public class AdapterPilotlessToOldCar implements OldCarControlSystem {
    private final PilotlessControlSystem pilotlessControl;

    public AdapterPilotlessToOldCar(PilotlessControlSystem pilotlessControl) {
        this.pilotlessControl = pilotlessControl;
    }

    @Override
    public void steer() {
        pilotlessControl.steering();
    }

    @Override
    public void brake() {
        pilotlessControl.stoping();
    }

    @Override
    public void accelerate() {
        pilotlessControl.speeding();
    }

    @Override
    public void turnOnDrive() {
        pilotlessControl.driveToForwarding();
    }

    @Override
    public void turnOnReverse() {
        pilotlessControl.driveToReversing();
    }

    @Override
    public void turnOnNeutral() {
        pilotlessControl.selectToNeutral();
    }
}
