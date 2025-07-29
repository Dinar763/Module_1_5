package homeWork.patterns.behavioral.chain;

import java.util.Objects;

public class Complaint {
    private int priority;

    public Complaint(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }
}
