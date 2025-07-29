package homeWork.patterns.creational.abstractfactory;

import homeWork.patterns.creational.abstractfactory.product.Shawarma;
import homeWork.patterns.creational.abstractfactory.restarant.ShawarmaFromMoskow;
import homeWork.patterns.creational.abstractfactory.restarant.ShawarmaFromTurkey;
import homeWork.patterns.creational.abstractfactory.restarant.ShawarmaRestaurant;
import homeWork.patterns.creational.abstractfactory.restarant.ShawarmaVegetarian;

public class Main {
    public static void main(String[] args) {
        ShawarmaRestaurant shawarmaFromMoskow = new ShawarmaFromMoskow();
        Shawarma moscowShawa = shawarmaFromMoskow.prepareShawarma();
        System.out.println(moscowShawa);

        ShawarmaVegetarian shawarmaVegetarian = new ShawarmaVegetarian();
        Shawarma vegShawa = shawarmaVegetarian.prepareShawarma();
        System.out.println(vegShawa);

        ShawarmaFromTurkey shawarmaFromTurkey = new ShawarmaFromTurkey();
        Shawarma turkishShawa = shawarmaFromTurkey.prepareShawarma();
        System.out.println(turkishShawa);
    }
}
