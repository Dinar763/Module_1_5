package homeWork.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Car implements CarComponent {
    private final Engine engine;
    private final Transmission transmission;
    private List<CarComponent> parts = new ArrayList<>();

    public Car(Engine engine, Transmission transmission) {
        this.engine = engine;
        this.transmission = transmission;
    }

    @Override
    public double getWeight() {
        double total = engine.getWeight() + transmission.getWeight();
        return parts.stream().mapToDouble(CarComponent::getWeight).sum() + total;
    }

    @Override
    public void add(CarComponent part) {
        parts.add(part);
    }

    @Override
    public String getName() {
        return "Автомобиль состоит из "
                + engine.getName() + transmission.getName();
    }
}
