package homeWork.patterns.behavioral.iterator;

import java.util.Iterator;

public class MainApp {
    public static void main(String[] args) {
        FruitBasket basket = new FruitBasket("Яблоко", "Банан", "Апельсин", "Груша", "Киви");

        FruitBasket.FruitIterator it = basket.createIterator();

        System.out.println("Все фрукты:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
