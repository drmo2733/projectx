package src.gorcnakan.authorclasswork;

public class Book {

    private String title;
    private String description;
    private double price;
    private int count;
    private String writer;

    public Book() {
    }

    public Book(String title, String description, double price,
                int count, String writer) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.count = count;
        this.writer=writer;
    }

    public String getTitle() {
        return title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", count=" + count +
                "writer='" + writer + '\'' +
                '}';
    }
}
