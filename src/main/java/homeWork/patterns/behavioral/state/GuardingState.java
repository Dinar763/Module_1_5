package homeWork.patterns.behavioral.state;

public class GuardingState implements RobotState {
    @Override
    public void execute(Robot robot) {
        System.out.println("Робот охраняет добытые минералы и транспортирует их на базу");
        robot.deliverMinerals();
    }

    @Override
    public void nextState(Robot robot) {

        System.out.println("Переход из Guarding в Charging...");
        robot.setState(new ChargingState());
    }
}
