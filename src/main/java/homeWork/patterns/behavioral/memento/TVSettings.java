package homeWork.patterns.behavioral.memento;

public class TVSettings {
    private final int volume;
    private final int brightness;
    private final String inputSource;

    public TVSettings(int volume, int brightness, String inputSource) {
        this.volume = volume;
        this.brightness = brightness;
        this.inputSource = inputSource;
    }

    public int getVolume() {
        return volume;
    }

    public int getBrightness() {
        return brightness;
    }

    public String getInputSource() {
        return inputSource;
    }
}
