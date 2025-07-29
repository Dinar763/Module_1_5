package homeWork.patterns.behavioral.strategy;

public class ScanningState implements RobotState {
    @Override
    public void execute(Robot robot) {
        System.out.println("Робот сканирует местность на наличие полезных ископаемых");
    }

}
