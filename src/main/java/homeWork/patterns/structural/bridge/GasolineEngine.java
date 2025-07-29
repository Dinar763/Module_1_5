package homeWork.patterns.structural.bridge;

public class GasolineEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Бензиновый двигатель запущен");
    }

    @Override
    public void stop() {
        System.out.println("Бензиновый двигатель остановлен");
    }

    @Override
    public void accelerate() {
        System.out.println("Бензиновый двигатель набирает обороты");
    }
}
