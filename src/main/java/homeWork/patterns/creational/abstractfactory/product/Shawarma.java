package homeWork.patterns.creational.abstractfactory.product;

import homeWork.patterns.creational.abstractfactory.ingredients.filling.Filling;
import homeWork.patterns.creational.abstractfactory.ingredients.lavash.Lavash;
import homeWork.patterns.creational.abstractfactory.ingredients.sauce.Sauce;

public class Shawarma {
    Lavash lavash;
    Sauce sauce;
    Filling filling;


    public Shawarma(Lavash lavash, Sauce sauce, Filling filling) {
        this.lavash = lavash;
        this.sauce = sauce;
        this.filling = filling;
    }

    @Override
    public String toString() {
        return String.format(
                "=============================\n" +
                        "Ваш заказ готов!!!!\n" +
                        "Шаурма: [%s, %s, %s]\n" +
                        "Приятного аппетита!!!\n" +
                        "=============================",
                lavash.getDescription(),
                sauce.getDescription(),
                filling.getDescription()
        );
    }
}
