package homeWork.patterns.structural.bridge;

abstract class Car {
    protected Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    abstract void drive();
    abstract void park();
}
