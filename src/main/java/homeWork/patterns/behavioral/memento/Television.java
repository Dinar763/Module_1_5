package homeWork.patterns.behavioral.memento;

public class Television {
    private int volume = 50;
    private int brightness = 50;
    private String inputSource = "TV";

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Громкость установлена на " + volume);
    }


    public void setBrightness(int brightness) {
        this.brightness = brightness;
        System.out.println("Яркость установлена на " + brightness);
    }

    public void setInputSource(String inputSource) {
        this.inputSource = inputSource;
        System.out.println("Источником является " + inputSource);
    }

    public void printSettings() {
        System.out.println("Текущие настройки: ");
        System.out.println("Громкость:  " + volume);
        System.out.println("Яркость:  " + brightness);
        System.out.println("Источник сигнала:  " + inputSource);
    }

    public TVSettings saveSettings() {
        return new TVSettings(volume, brightness, inputSource);
    }

    public void restoreSettings(TVSettings settings) {
        this.volume = settings.getVolume();
        this.brightness = settings.getBrightness();
        this.inputSource = settings.getInputSource();
        System.out.println("Настройки телевизора восстановлены");
    }
}
