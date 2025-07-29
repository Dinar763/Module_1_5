package homeWork.patterns.behavioral.strategy;

public class GuardingState implements RobotState {
    @Override
    public void execute(Robot robot) {
        System.out.println("Робот охраняет добытые минералы и транспортирует их на базу");
        robot.deliverMinerals();
    }
}
