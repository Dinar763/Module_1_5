package homeWork.patterns.structural.bridge;

public class Sedan extends Car {
    public Sedan(Engine engine) {
        super(engine);
    }

    @Override
    void drive() {
        engine.start();
        engine.accelerate();
        System.out.println("Машина едет");
    }

    @Override
    void park() {
        engine.stop();
        System.out.println("Машина стоит");
    }
}
