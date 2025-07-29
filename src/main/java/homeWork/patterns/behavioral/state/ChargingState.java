package homeWork.patterns.behavioral.state;

public class ChargingState implements RobotState {
    @Override
    public void execute(Robot robot) {
        System.out.println("Робот в режиме подзарядки. Не приближаться ближе 5м! " +
                "При попытке приближения вы будете уничтожены");
    }

    @Override
    public void nextState(Robot robot) {
        System.out.println("Переход из Charging в Scanning...");
        robot.setState(new ScanningState());
    }
}
