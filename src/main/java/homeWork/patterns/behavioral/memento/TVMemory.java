package homeWork.patterns.behavioral.memento;

import java.util.HashMap;
import java.util.Map;

public class TVMemory {
    private final Map<Integer, TVSettings> savedSettings = new HashMap<>();

    public void saveCurrentSettings(Television tv, int slot) {
        if (slot < 1 || slot > 5) {
            System.out.println("Неверный номер ячейки, должно быть от 1 до 5");
            return;
        }
        savedSettings.put(slot, tv.saveSettings());
        System.out.println("Настройки сохранены в ячейку " + slot);
    }

    public void loadSettings(Television tv, int slot) {
        if (!savedSettings.containsKey(slot)) {
            System.out.println("Данная ячейка пуста");
            return;
        }
        tv.restoreSettings(savedSettings.get(slot));
    }
}
