package homeWork.patterns.creational.prototype;

public class PaintingFactory {
    Painting painting;

    public PaintingFactory(Painting painting) {
        this.painting = painting;
    }

    public void setPainting(Painting painting) {
        this.painting = painting;
    }

    Painting clonePainting() {
        return (Painting) painting.copy();
    }
}
