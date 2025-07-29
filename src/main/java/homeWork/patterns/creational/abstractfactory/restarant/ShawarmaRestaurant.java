package homeWork.patterns.creational.abstractfactory.restarant;

import homeWork.patterns.creational.abstractfactory.ingredients.filling.Filling;
import homeWork.patterns.creational.abstractfactory.ingredients.lavash.Lavash;
import homeWork.patterns.creational.abstractfactory.ingredients.sauce.Sauce;
import homeWork.patterns.creational.abstractfactory.product.Shawarma;

public abstract class ShawarmaRestaurant {

    protected abstract Lavash createLavash();
    protected abstract Sauce createSauce();
    protected abstract Filling createFilling();

    public Shawarma prepareShawarma() {
        Lavash lavash = createLavash();
        Sauce sauce = createSauce();
        Filling filling = createFilling();
        return new Shawarma(lavash, sauce, filling);
    }
}
