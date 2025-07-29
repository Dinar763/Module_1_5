package homeWork.patterns.behavioral.strategy;

public class MiningState implements RobotState {
    @Override
    public void execute(Robot robot) {
        System.out.println("Робот добывает обнаруженные минералы");
        robot.addMinerals(10);
    }
}
