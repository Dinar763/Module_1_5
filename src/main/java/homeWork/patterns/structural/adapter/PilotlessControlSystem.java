package homeWork.patterns.structural.adapter;

public class PilotlessControlSystem {
    public void speeding() {
        System.out.println("Ускоряюсь в движении");
    }

    public void stoping() {
        System.out.println("Торможу");
    }

    public void steering() {
        System.out.println("Рулю");
    }

    public void driveToForwarding() {
        System.out.println("Еду вперед");
    }

    public void driveToReversing() {
        System.out.println("Еду назад");
    }

    public void selectToNeutral() {
        System.out.println("Стою на месте");
    }
}
