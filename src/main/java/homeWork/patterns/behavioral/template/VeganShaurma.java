package homeWork.patterns.behavioral.template;

public class VeganShaurma extends Shaurma {
    @Override
    protected void addFilling() {
        System.out.println("Режем начинку только с овощами");
    }
}
