package homeWork.patterns.behavioral.interpreter;

public class Calculator {
    public static void main(String[] args) {
        Expression exp = new Add(new Subtract(new Number(10),
                new Number(22)), new Number(22));
        int result = exp.interpret();
        System.out.println(result);
    }
}
