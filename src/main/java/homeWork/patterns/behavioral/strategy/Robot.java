package homeWork.patterns.behavioral.strategy;

public class Robot {
    private RobotState state;
    private int minerals;


    public Robot() {
        this.state = new ChargingState();
        this.minerals = 0;
    }

    public void setState(RobotState state) {
        this.state = state;
    }

    public void execute() {
        state.execute(this);
    }


    public void addMinerals(int amount) {
        this.minerals += amount;
    }

    public int getMinerals() {
        return minerals;
    }

    public void deliverMinerals() {
        System.out.println("Доставлено " + minerals + " единиц минералов на базу");
        this.minerals = 0;
    }
}
