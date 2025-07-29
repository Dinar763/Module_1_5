package homeWork.patterns.behavioral.state;

public interface RobotState {
    void execute(Robot robot);
    void nextState(Robot robot);
}
