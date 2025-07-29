package homeWork.patterns.creational.builder;

public class MainApp {
    public static void main(String[] args) {
        Shawarma piterShawarma = new Shawarma.Builder()
                .lavash("тонкий лаваш")
                .filling("овощи с курицей")
                .build();
        System.out.println(piterShawarma);
    }
}
