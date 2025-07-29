package homeWork.patterns.creational.abstractfactory.ingredients.lavash;

public class ThickLavash implements Lavash {
    @Override
    public String getDescription() {
        return "Тонкий лаваш";
    }

    @Override
    public void lavashBaked() {
        System.out.println("Печется тонкий лаваш");
    }
}
