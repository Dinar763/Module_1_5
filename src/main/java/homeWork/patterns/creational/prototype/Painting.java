package homeWork.patterns.creational.prototype;

public class Painting implements Copyable {
    private String name;
    private String author;
    private Double price;
    private Integer year;
    private String style;
    private String medium;

    public Painting(String name,
                    String author,
                    Double price,
                    Integer year,
                    String style,
                    String medium) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.year = year;
        this.style = style;
        this.medium = medium;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }


    @Override
    public Object copy() {
        Painting copyPainting = new Painting(name, author, price, year, style, medium);
        return copyPainting;
    }

    @Override
    public String toString() {
        return "Painting{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", style='" + style + '\'' +
                ", medium='" + medium + '\'' +
                '}';
    }
}
