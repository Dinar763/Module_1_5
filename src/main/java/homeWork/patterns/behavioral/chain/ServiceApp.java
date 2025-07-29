package homeWork.patterns.behavioral.chain;

public class ServiceApp {
    public static void main(String[] args) {
        SupportHandler autoResponder = new AutoResponder(Priority.ROUTINE);
        SupportHandler operator = new Operator(Priority.IMPORTANT);
        SupportHandler manager = new Manager(Priority.ASAP);

        autoResponder.setNextSupportHandler(operator);
        operator.setNextSupportHandler(manager);

        Complaint question1 = new Complaint(Priority.ROUTINE);
        autoResponder.handlerRequest(question1);
        Complaint question2 = new Complaint(Priority.IMPORTANT);
        autoResponder.handlerRequest(question2);
        Complaint question3 = new Complaint( Priority.ASAP);
        autoResponder.handlerRequest(question3);
    }
}
