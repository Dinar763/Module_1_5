package homeWork.patterns.behavioral.command;

public class CookPastaCommand implements Command {
    private Chef chef;

    public CookPastaCommand(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void execute() {
        chef.cookPasta();
    }

    @Override
    public void undo() {
        chef.undo();
    }
}
