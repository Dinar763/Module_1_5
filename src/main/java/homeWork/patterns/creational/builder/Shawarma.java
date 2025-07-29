package homeWork.patterns.creational.builder;

public class Shawarma {
    private final String lavash;
    private final String sauce;
    private final String filling;

    private Shawarma(Builder builder) {
        this.lavash = builder.lavash;
        this.sauce = builder.sauce;
        this.filling = builder.filling;
    }

    public static class Builder {
        private String lavash;
        private String sauce;
        private String filling;

        public Builder lavash(String lavash) {
            this.lavash = lavash;
            return this;
        }

        public Builder sause(String sause) {
            this.sauce = sause;
            return this;
        }

        public Builder filling(String filling) {
            this.filling = filling;
            return this;
        }

        public Shawarma build() {
            if (lavash == null) {
                throw new IllegalArgumentException("Лаваш обязателен!!!");
            } else if (sauce == null) {
                sauce = "чесночный соус";
            }
            return new Shawarma(this);
        }
    }

    @Override
    public String toString() {
        return String.format(
                "=============================\n" +
                        "Ваш заказ готов!!!!\n" +
                        "Шаурма: [%s, %s, %s]\n" +
                        "Приятного аппетита!!!\n" +
                        "=============================",
                lavash,
                sauce,
                filling
        );
    }
}
