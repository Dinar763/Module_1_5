package homeWork.patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class CommandRunner {

    public static void main(String[] args) {
        WarriorFactory factory = new WarriorFactory();

        List<Warrior> warriors = new ArrayList<>();

        warriors.add(factory.getWarriorBySpeciality("archer"));
        warriors.add(factory.getWarriorBySpeciality("archer"));
        warriors.add(factory.getWarriorBySpeciality("archer"));
        warriors.add(factory.getWarriorBySpeciality("archer"));
        warriors.add(factory.getWarriorBySpeciality("archer"));
        warriors.add(factory.getWarriorBySpeciality("archer"));
        warriors.add(factory.getWarriorBySpeciality("archer"));
        warriors.add(factory.getWarriorBySpeciality("archer"));
        warriors.add(factory.getWarriorBySpeciality("cavalier"));
        warriors.add(factory.getWarriorBySpeciality("cavalier"));
        warriors.add(factory.getWarriorBySpeciality("cavalier"));
        warriors.add(factory.getWarriorBySpeciality("cavalier"));
        warriors.add(factory.getWarriorBySpeciality("cavalier"));

        for (Warrior warrior : warriors) {
            warrior.fight();
        }
    }
}
