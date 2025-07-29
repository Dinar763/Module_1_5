package homeWork.patterns.creational.factory;

public class CharryDriverFactory implements DriverFactory {
    @Override
    public Driver createDriver() {
        return new GharryDriver();
    }
}
