package homeWork.patterns.behavioral.command;

public class Chef {
    public void cookPasta() {
        System.out.println("Повар готовит пасту");
    }

    public void cookPizza() {
        System.out.println("Повар готовит пиццу");
    }

    public void undo() {
        System.out.println("Заказ отменен");
    }
}
