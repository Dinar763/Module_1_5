package homeWork.patterns.behavioral.state;

public class AsteroidMission {
    public static void main(String[] args) {
        Robot robot = new Robot();

        for (int i = 0; i < 40; i++) {
            System.out.println("\n=== День " + i + " ===");

            robot.findMinerals(i % 2 == 0);

            robot.execute();
            robot.nextState();

            robot.execute();
            robot.nextState();
        }
    }
}
