package homeWork.patterns.creational.abstractfactory.ingredients.sauce;

public class YogurtSauce implements Sauce {
    @Override
    public String getDescription() {
        return "Йогуртовый соус";
    }

    @Override
    public void saucePrepared() {
        System.out.println("готовится йогуртовый соус");
    }
}
