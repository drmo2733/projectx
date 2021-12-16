package src.gorcnakan.authorclasswork;

public class BookStorage {
    private Book[] books = new Book[18];
    private int size;

    public void add(Book book) {
        if (books.length == size) {
            extend();
        }
        books[size++] = book;
    }

    private void extend() {
        Book[] tmp = new Book[books.length + 10];
        System.arraycopy(books, 0, tmp, 0, books.length);
        books = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);

        }
    }

    public void searchByTitle(String keyword) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().contains(keyword)) {
                System.out.println(books[i]);
            }

        }
    }

    public void searchByWriter(String keyword) {
        for (int i = 0; i < size; i++) {
            if (books[i].getWriter().contains(keyword)) {
                System.out.println(books[i]);
            }

        }
    }

    public void searchByPrice(double minPrice, double maxPrice) {
        for (int i = 0; i < size; i++) {
            if (books[i].getPrice() > minPrice
                    && books[i].getPrice() < maxPrice) {
                System.out.println(books[i]);
            }

        }
    }
}
