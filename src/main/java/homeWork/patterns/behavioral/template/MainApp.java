package homeWork.patterns.behavioral.template;

public class MainApp {
    public static void main(String[] args) {
        Shaurma shaurma1 = new MoscowShaurma();
        Shaurma shaurma2 = new VeganShaurma();
        shaurma1.makeShaurma();
        shaurma2.makeShaurma();
    }
}
