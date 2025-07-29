package homeWork.patterns.behavioral.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class FruitBasket {
    private String[] fruits;

    public FruitBasket(String... fruits) {
        this.fruits = fruits;
    }

    public FruitIterator createIterator() {
        return new FruitIterator();
    }

    public class FruitIterator implements Iterator<String> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < fruits.length;
        }

        @Override
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return fruits[index++];
        }

        public void resetBasket() {
            index = 0;
        }

        public String nextEven() {
            while (hasNext()) {
                String fruit = fruits[index++];
                if (index % 2 == 1) {
                    return fruit;
                }
            }

            throw new NoSuchElementException();
        }
    }
}
