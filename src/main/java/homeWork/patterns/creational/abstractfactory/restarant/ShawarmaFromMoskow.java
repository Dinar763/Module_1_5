package homeWork.patterns.creational.abstractfactory.restarant;

import homeWork.patterns.creational.abstractfactory.ingredients.filling.Filling;
import homeWork.patterns.creational.abstractfactory.ingredients.filling.MeatFilling;
import homeWork.patterns.creational.abstractfactory.ingredients.lavash.Lavash;
import homeWork.patterns.creational.abstractfactory.ingredients.lavash.ThickLavash;
import homeWork.patterns.creational.abstractfactory.ingredients.sauce.GarlicSauce;
import homeWork.patterns.creational.abstractfactory.ingredients.sauce.Sauce;

public class ShawarmaFromMoskow extends ShawarmaRestaurant {

    @Override
    protected Lavash createLavash() {
        ThickLavash thickLavash = new ThickLavash();
        thickLavash.lavashBaked();
        return thickLavash;
    }

    @Override
    protected Sauce createSauce() {
        GarlicSauce garlicSauce = new GarlicSauce();
        garlicSauce.saucePrepared();
        return garlicSauce;
    }

    @Override
    protected Filling createFilling() {
        MeatFilling meatFilling = new MeatFilling();
        meatFilling.fillingIsCut();
        return meatFilling;
    }
}
