package homeWork.patterns.behavioral.command;

public class CookPizzaCommand implements Command {
    Chef chef;

    public CookPizzaCommand(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void execute() {
        chef.cookPizza();
    }

    @Override
    public void undo() {
        chef.undo();
    }


}
