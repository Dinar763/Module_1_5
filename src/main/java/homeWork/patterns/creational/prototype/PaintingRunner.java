package homeWork.patterns.creational.prototype;

public class PaintingRunner {
    public static void main(String[] args) {
        Painting painting = new Painting("Бурлаки на Волге",
                "Илья Репин",
                900000000.0,
                1873,
                "Реализм",
                "Холст"
        );
        System.out.println(painting);

        Painting paintingClone = (Painting) painting.copy();
        System.out.println(paintingClone);

        PaintingFactory factory = new PaintingFactory(painting);
        Painting paintingNewClone = factory.clonePainting();
        System.out.println(paintingClone);
    }
}
