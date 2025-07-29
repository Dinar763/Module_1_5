package homeWork.patterns.behavioral.state;

public class ScanningState implements RobotState {
    @Override
    public void execute(Robot robot) {
        System.out.println("Робот сканирует местность на наличие полезных ископаемых");
    }

    @Override
    public void nextState(Robot robot) {
        if (robot.hasFoundMinerals()) {
            System.out.println("Переход из Scanning в Mining...");
            robot.setState(new MiningState());
        } else {
            System.out.println("Минералы не найдены, продолжаем сканирование");
        }
    }
}
