package homeWork.patterns.behavioral.strategy;

public class AsteroidMission {
    public static void main(String[] args) {
        Robot robot = new Robot();

        System.out.println("=== День 1 ===");
        robot.setState(new ChargingState());
        robot.execute();

        System.out.println("\n=== День 2 ===");
        robot.setState(new ScanningState());
        robot.execute();

        System.out.println("\n=== День 3 ===");
        robot.setState(new MiningState());
        robot.execute();


        System.out.println("\n=== День 4 ===");
        robot.setState(new GuardingState());
        robot.execute();


    }
}
