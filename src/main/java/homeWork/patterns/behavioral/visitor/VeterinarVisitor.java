package homeWork.patterns.behavioral.visitor;

public class VeterinarVisitor implements Visitor {
    @Override
    public void visitLion(Lion lion) {
        System.out.println("Я вылечу льва");
    }

    @Override
    public void visitMonkey(Monkey monkey) {
        System.out.println("Я вылечу обезьяну");
    }
}
