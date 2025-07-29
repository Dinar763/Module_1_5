package homeWork.patterns.creational.factory;

public class TruckDriverFactory implements DriverFactory {
    @Override
    public Driver createDriver() {
        return new TruckDriver();
    }
}
