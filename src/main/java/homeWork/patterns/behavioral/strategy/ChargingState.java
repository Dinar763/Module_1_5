package homeWork.patterns.behavioral.strategy;

public class ChargingState implements RobotState {
    @Override
    public void execute(Robot robot) {
        System.out.println("Робот в режиме подзарядки. Не приближаться ближе 5м! " +
                "При попытке приближения вы будете уничтожены");
    }
}
