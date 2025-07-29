package homeWork.patterns.creational.abstractfactory.ingredients.filling;

public class MeatFilling implements Filling {

    @Override
    public String getDescription() {
        return "Мясная начинка";
    }

    @Override
    public void fillingIsCut() {
        System.out.println("Начинка нарезается с мясом");
    }
}
