package homeWork.patterns.creational.abstractfactory.ingredients.lavash;

public class ThinLavash implements Lavash {
    @Override
    public String getDescription() {
        return "Толстый лаваш";
    }

    @Override
    public void lavashBaked() {
        System.out.println("Печется толстый лаваш");
    }
}
