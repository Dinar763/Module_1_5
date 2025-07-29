package homeWork.patterns.behavioral.chain;

public class Operator extends SupportHandler {
    public Operator(int priority) {
        super(priority);
    }

    @Override
    protected void processRequest(Complaint complaint) {
        System.out.println("Оператор сейчас вам перезвонит");
    }
}
