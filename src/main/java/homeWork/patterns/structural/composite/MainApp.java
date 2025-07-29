package homeWork.patterns.structural.composite;

public class MainApp {
    public static void main(String[] args) {
        Aggregate block = new Aggregate("Блок", 300);
        Aggregate head = new Aggregate("ГБЦ", 100);
        Aggregate compressor = new Aggregate("Компрессор",50);
        Aggregate turbine = new Aggregate("Турбина", 50);
        Aggregate gearBox = new Aggregate("КПП", 300);
        Aggregate clutch = new Aggregate("Сцепление", 50);

        Engine engine = new Engine();
        engine.add(block);
        engine.add(head);
        engine.add(compressor);
        engine.add(turbine);

        Transmission transmission = new Transmission();
        transmission.add(gearBox);
        transmission.add(clutch);

        Car car = new Car(engine, transmission);
        System.out.println(engine.getName());
        System.out.println(transmission.getName());
        System.out.println(car.getName());

        System.out.println("Масса двигателя: " + engine.getWeight());
        System.out.println("Масса трансмиссии: " + transmission.getWeight());
        System.out.println("Масса автомобиля: " + car.getWeight());
    }
}
