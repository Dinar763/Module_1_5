package homeWork.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class WarriorFactory {
    private static final Map<String, Warrior> warriors = new HashMap<>();

    public Warrior getWarriorBySpeciality(String specialty) {
        Warrior warrior = warriors.get(specialty);

        if (warrior == null) {
            switch (specialty) {
                case "archer":
                    System.out.println("Hiring archer warriors");
                    warrior = new Archer();
                    break;
                case "cavalier":
                    System.out.println("Hiring cavalier warriors");
                    warrior = new Cavalier();
                    break;
            }
            warriors.put(specialty, warrior);
        }
        return warrior;
    }
}
