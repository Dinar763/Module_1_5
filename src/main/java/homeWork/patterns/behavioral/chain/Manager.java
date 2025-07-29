package homeWork.patterns.behavioral.chain;

public class Manager extends SupportHandler {

    public Manager(int priority) {
        super(priority);
    }

    @Override
    protected void processRequest(Complaint complaint) {
        System.out.println("Сейчас все решим на уровне управляющего!");
    }
}
