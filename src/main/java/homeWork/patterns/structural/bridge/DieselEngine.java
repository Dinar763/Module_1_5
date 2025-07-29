package homeWork.patterns.structural.bridge;

public class DieselEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Дизельный двигатель запущен");
    }

    @Override
    public void stop() {
        System.out.println("Дизельный двигатель остановлен");
    }

    @Override
    public void accelerate() {
        System.out.println("Дизельный двигатель набирает обороты");
    }
}
