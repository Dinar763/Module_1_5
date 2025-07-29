package homeWork.patterns.creational.factory;

public class CarDriver implements Driver {
    @Override
    public void drive() {
        System.out.println("Я еду на легковой машине");
    }
}
