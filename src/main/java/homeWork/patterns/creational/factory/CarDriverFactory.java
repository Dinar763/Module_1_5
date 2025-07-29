package homeWork.patterns.creational.factory;

public class CarDriverFactory implements DriverFactory {
    @Override
    public Driver createDriver() {
        return new CarDriver();
    }
}
