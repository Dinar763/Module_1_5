package homeWork.patterns.structural.bridge;

public class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Электрический двигатель запущен");
    }

    @Override
    public void stop() {
        System.out.println("Электрический двигатель остановлен");
    }

    @Override
    public void accelerate() {
        System.out.println("Электрический двигатель набирает обороты");
    }
}
