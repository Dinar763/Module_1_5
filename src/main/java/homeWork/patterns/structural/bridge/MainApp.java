package homeWork.patterns.structural.bridge;

public class MainApp {
    public static void main(String[] args) {
        GasolineEngine gasolineEngine = new GasolineEngine();
        ElectricEngine electricEngine = new ElectricEngine();

        Car fordSedan = new Sedan(gasolineEngine);
        Car teslaSedan = new Sedan(electricEngine);
        fordSedan.drive();
        teslaSedan.drive();
    }
}
