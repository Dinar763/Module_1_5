package homeWork.patterns.behavioral.visitor;

public class MainApp {
    public static void main(String[] args) {
        Animal[] animals = {new Lion(), new Monkey()};

        Visitor aibolit = new VeterinarVisitor();
        Visitor handler = new HandlerVisitor();

        for (Animal animal : animals) {
            animal.accept(aibolit);
            animal.accept(handler);
        }
    }
}
