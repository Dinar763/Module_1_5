package homeWork.patterns.behavioral.command;

public class MainApp {
    public static void main(String[] args) {
        Chef chef = new Chef();
        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(new CookPastaCommand(chef));
        remoteControl.pressButton();

        remoteControl.setCommand(new CookPizzaCommand(chef));
        remoteControl.pressButton();
    }
}
