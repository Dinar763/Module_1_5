package homeWork.patterns.behavioral.chain;

public abstract class SupportHandler {
    private SupportHandler nextHandler;
    private final int priority;

    public SupportHandler(int priority) {
        this.priority = priority;
    }

    public void setNextSupportHandler(SupportHandler next) {
        this.nextHandler = next;
    }

    public void handlerRequest(Complaint complaint) {
        if (complaint.getPriority() >= priority) {
            processRequest(complaint);
        }
        if (nextHandler != null) {
            nextHandler.handlerRequest(complaint);
        }
    }

    protected abstract void processRequest(Complaint complaint);
}
