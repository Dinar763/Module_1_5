package homeWork.patterns.behavioral.visitor;

public class HandlerVisitor implements Visitor {
    @Override
    public void visitLion(Lion lion) {
        System.out.println("Я дрессирую льва");
    }

    @Override
    public void visitMonkey(Monkey monkey) {
        System.out.println("Я дрессирую обезьяну");
    }
}
