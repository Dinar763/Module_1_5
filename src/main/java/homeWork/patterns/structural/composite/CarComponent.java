package homeWork.patterns.structural.composite;

public interface CarComponent {
    double getWeight();
    void add(CarComponent part);
    String getName();
}
