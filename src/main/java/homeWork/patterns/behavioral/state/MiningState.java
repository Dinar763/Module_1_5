package homeWork.patterns.behavioral.state;

public class MiningState implements RobotState {
    @Override
    public void execute(Robot robot) {
        System.out.println("Робот добывает обнаруженные минералы");
        robot.addMinerals(10);
    }

    @Override
    public void nextState(Robot robot) {
        if (robot.getMinerals() >= 50) {
            System.out.println("Переход из Mining в Guarding...");
            robot.setState(new GuardingState());
        } else {
            System.out.println("Продолжаем добычу...");
        }
    }
}
