package homeWork.patterns.creational.abstractfactory.ingredients.filling;

public class ChickenFilling implements Filling {

    @Override
    public String getDescription() {
        return "Куриная начинка";
    }

    @Override
    public void fillingIsCut() {
        System.out.println("Начинка нарезается с курицей");
    }
}
