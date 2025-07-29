package homeWork.patterns.creational.abstractfactory.restarant;

import homeWork.patterns.creational.abstractfactory.ingredients.filling.ChickenFilling;
import homeWork.patterns.creational.abstractfactory.ingredients.filling.Filling;
import homeWork.patterns.creational.abstractfactory.ingredients.lavash.Lavash;
import homeWork.patterns.creational.abstractfactory.ingredients.lavash.ThinLavash;
import homeWork.patterns.creational.abstractfactory.ingredients.sauce.Sauce;
import homeWork.patterns.creational.abstractfactory.ingredients.sauce.SpicySauce;

public class ShawarmaFromTurkey extends ShawarmaRestaurant {

    @Override
    protected Lavash createLavash() {
        ThinLavash thinLavash = new ThinLavash();
        thinLavash.lavashBaked();
        return thinLavash;
    }

    @Override
    protected Sauce createSauce() {
        SpicySauce spicySauce = new SpicySauce();
        spicySauce.saucePrepared();
        return spicySauce;
    }

    @Override
    protected Filling createFilling() {
        ChickenFilling chickenFilling = new ChickenFilling();
        chickenFilling.fillingIsCut();
        return chickenFilling;
    }
}
