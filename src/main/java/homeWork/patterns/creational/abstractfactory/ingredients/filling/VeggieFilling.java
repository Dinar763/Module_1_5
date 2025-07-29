package homeWork.patterns.creational.abstractfactory.ingredients.filling;

public class VeggieFilling implements Filling {

    @Override
    public String getDescription() {
        return "Овощная начинка";
    }

    @Override
    public void fillingIsCut() {
        System.out.println("Начинка нарезается только с овощами");
    }
}
