package homeWork.patterns.creational.abstractfactory.ingredients;

public interface Ingredient {
    default String getDescription() {
        return this.getClass().getSimpleName();
    }
}
