package homeWork.patterns.structural.composite;

public class Aggregate implements CarComponent {
    private String name;
    private double weight;

    public Aggregate(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void add(CarComponent part) {
        throw new UnsupportedOperationException("Нельзя добавить деталь к агрегату");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
