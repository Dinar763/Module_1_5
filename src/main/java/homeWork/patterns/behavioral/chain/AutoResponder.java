package homeWork.patterns.behavioral.chain;

public class AutoResponder extends SupportHandler {

    public AutoResponder(int priority) {
        super(priority);
    }


    @Override
    protected void processRequest(Complaint complaint) {
        System.out.println("Ваш вопрос решен: вот ссылка на решение");
    }
}
