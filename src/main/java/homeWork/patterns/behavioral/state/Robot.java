package homeWork.patterns.behavioral.state;

public class Robot {
    private RobotState state;
    private int minerals;
    private boolean mineralsFound;


    public Robot() {
        this.state = new ChargingState();
        this.minerals = 0;
        this.mineralsFound = false;
    }

    public void setState(RobotState state) {
        this.state = state;
    }

    public void execute() {
        state.execute(this);
    }

    public void nextState() {
        state.nextState(this);
    }

    public void findMinerals(boolean found) {
        this.mineralsFound = found;
    }

    public boolean hasFoundMinerals() {
        return mineralsFound;
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
        this.mineralsFound = false;
    }
}
