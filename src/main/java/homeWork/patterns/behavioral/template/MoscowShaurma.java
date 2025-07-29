package homeWork.patterns.behavioral.template;

public class MoscowShaurma extends Shaurma {
    @Override
    protected void addFilling() {
        System.out.println("Режем начинку с овощами и курицей");
    }
}
