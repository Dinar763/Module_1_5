package homeWork.patterns.behavioral.template;

public abstract class Shaurma {

    public final void makeShaurma() {
        makeLavash();
        addSause();
        addFilling();
    }

    private void makeLavash() {
        System.out.println("Разворачиваем лаваш");
    }

    private void addSause() {
        System.out.println("Добавляем соус");
    }

    protected abstract void addFilling();
}
