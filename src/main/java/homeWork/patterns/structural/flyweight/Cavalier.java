package homeWork.patterns.structural.flyweight;

public class Cavalier implements Warrior {
    @Override
    public void fight() {
        System.out.println("Кавалерист сражается шашкой на коне");
    }
}
