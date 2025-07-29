package homeWork.patterns.creational.abstractfactory.ingredients.sauce;

public class SpicySauce implements Sauce {
    @Override
    public String getDescription() {
        return "Острый соус";
    }

    @Override
    public void saucePrepared() {
        System.out.println("готовится острый соус");
    }
}
