package homeWork.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Transmission implements CarComponent {
    private List<CarComponent> parts = new ArrayList<>();

    @Override
    public double getWeight() {
        return parts.stream().mapToDouble(CarComponent::getWeight).sum();
    }

    @Override
    public void add(CarComponent part) {
        parts.add(part);
    }

    @Override
    public String getName() {
        return "Трансмиссия состоит из "
                + parts.stream()
                       .map(CarComponent::getName)
                       .collect(Collectors.joining(", "));
    }
}
