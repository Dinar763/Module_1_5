package homeWork.patterns.behavioral.memento;

import java.util.Scanner;

public class TVDemo {
    public static void main(String[] args) {
        Television television = new Television();
        TVMemory tvMemory = new TVMemory();

        System.out.println("1. Начальные настройки:");
        television.printSettings();

        System.out.println("\n2. Сохраняем настройки в ячейку 1");
        tvMemory.saveCurrentSettings(television, 1);

        System.out.println("\n3. Меняем настройки:");
        television.setVolume(75);
        television.setBrightness(80);
        television.setInputSource("HDMI");
        television.printSettings();

        System.out.println("\n4. Сохраняем новые настройки в ячейку 2");
        tvMemory.saveCurrentSettings(television, 2);

        System.out.println("\n6. Загружаем настройки из ячейки 1");
        tvMemory.loadSettings(television, 1);
        television.printSettings();
    }
}
