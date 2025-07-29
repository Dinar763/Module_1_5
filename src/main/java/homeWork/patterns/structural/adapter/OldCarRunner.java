package homeWork.patterns.structural.adapter;

public class OldCarRunner {
    public static void main(String[] args) {
        PilotlessControlSystem autoPilotByOldCAr = new PilotlessControlSystem();
        OldCarControlSystem oldCarControlSystem = new AdapterPilotlessToOldCar(autoPilotByOldCAr);

        oldCarControlSystem.turnOnDrive();
        oldCarControlSystem.accelerate();
        oldCarControlSystem.brake();
        oldCarControlSystem.steer();
        oldCarControlSystem.turnOnReverse();
        oldCarControlSystem.turnOnNeutral();
    }
}
