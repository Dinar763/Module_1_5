package homeWork.patterns.creational.abstractfactory.restarant;

import homeWork.patterns.creational.abstractfactory.ingredients.filling.Filling;
import homeWork.patterns.creational.abstractfactory.ingredients.filling.VeggieFilling;
import homeWork.patterns.creational.abstractfactory.ingredients.lavash.Lavash;
import homeWork.patterns.creational.abstractfactory.ingredients.lavash.ThickLavash;
import homeWork.patterns.creational.abstractfactory.ingredients.sauce.Sauce;
import homeWork.patterns.creational.abstractfactory.ingredients.sauce.YogurtSauce;

public class ShawarmaVegetarian extends ShawarmaRestaurant {
    @Override
    protected Lavash createLavash() {
        ThickLavash thickLavash = new ThickLavash();
        thickLavash.lavashBaked();
        return thickLavash;
    }

    @Override
    protected Sauce createSauce() {
        YogurtSauce yogurtSauce = new YogurtSauce();
        yogurtSauce.saucePrepared();
        return yogurtSauce;
    }

    @Override
    protected Filling createFilling() {
        VeggieFilling veggieFilling = new VeggieFilling();
        veggieFilling.fillingIsCut();
        return veggieFilling;
    }
}
