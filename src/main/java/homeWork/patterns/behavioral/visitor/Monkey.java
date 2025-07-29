package homeWork.patterns.behavioral.visitor;

public class Monkey implements Animal {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitMonkey(this);
    }
}
