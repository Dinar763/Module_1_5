package homeWork.patterns.creational.abstractfactory.ingredients.sauce;

public class GarlicSauce implements Sauce {
    @Override
    public String getDescription() {
        return "Чесночный соус";
    }

    @Override
    public void saucePrepared() {
        System.out.println("готовится чесночный соус");
    }
}
