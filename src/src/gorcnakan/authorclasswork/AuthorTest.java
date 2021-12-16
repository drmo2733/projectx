package src.gorcnakan.authorclasswork;

import java.util.Scanner;

public class AuthorTest {

    static Scanner scanner = new Scanner(System.in);
    static AuthorStorage authorStorage = new AuthorStorage();
    static BookStorage bookStorage = new BookStorage();

    private static final String EXIT = "0";
    private static final String ADD_AUTHOR = "1";
    private static final String SEARCH_AUTHORS = "2";
    private static final String SEARCH_AUTHORS_BY_AGE = "3";
    private static final String PRINT_AUTHORS = "4";
    private static final String ADD_BOOK = "5";
    private static final String SEARCH_BOOKS_BY_TITLE = "6";
    private static final String SEARCH_BOOKS_BY_WRITER = "7";
    private static final String SEARCH_BOOKS_BY_PRICE = "8";
    private static final String PRINT_BOOKS = "9";


    public static void main(String[] args) {
        authorStorage.add(new Author("poxos", "poxosyan",
                22, "poxos@mail.com", "male"));
        authorStorage.add(new Author("poxosuhi", "poxosyan",
                23, "poxosuhi@mail.com", "female"));
        authorStorage.add(new Author("petros", "petrosyan",
                25, "petros@mail.com", "male"));
        bookStorage.add(new Book("Мастер и Маргарита", "роман",
                1800, 18, "Михаил Булгаков"));
        bookStorage.add(new Book("Идиот", "роман",
                2200, 22, "Фёдор Достоевский"));
        bookStorage.add(new Book("Бойцовский клуб", "роман",
                2000, 20, "Чак Паланик"));
        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case SEARCH_AUTHORS:
                    searchByName();
                    break;
                case SEARCH_AUTHORS_BY_AGE:
                    searchByAge();
                    break;
                case PRINT_AUTHORS:
                    authorStorage.print();
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case SEARCH_BOOKS_BY_TITLE:
                    searchByTitle();
                    break;
                case SEARCH_BOOKS_BY_WRITER:
                    searchByWriter();
                    break;
                case SEARCH_BOOKS_BY_PRICE:
                    searchByPrice();
                    break;
                case PRINT_BOOKS:
                    bookStorage.print();
                    break;
                default:
                    System.out.println("Invalid command");
            }
        }
    }

    private static void searchByPrice() {
        System.out.println("please input min price");
        double minPrice = Double.parseDouble(scanner.nextLine());
        System.out.println("please input max price");
        double maxPrice = Double.parseDouble(scanner.nextLine());
        bookStorage.searchByPrice(minPrice, maxPrice);
    }

    private static void searchByWriter() {
        System.out.println("please input keyword");
        String keyword = scanner.nextLine();
        bookStorage.searchByWriter(keyword);
    }

    private static void searchByTitle() {
        System.out.println("please input keyword");
        String keyword = scanner.nextLine();
        bookStorage.searchByTitle(keyword);
    }

    private static void addBook() {
        System.out.println("please input books title");
        String title = scanner.nextLine();
        System.out.println("please input books description");
        String description = scanner.nextLine();
        System.out.println("please input books price");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("please input count of books");
        int count = Integer.parseInt(scanner.nextLine());
        System.out.println("please input books writer");
        String writer = scanner.nextLine();

        Book book = new Book(title, description, price, count, writer);
        bookStorage.add(book);
        System.out.println("Thank's, book was added.");

    }

    private static void searchByAge() {
        System.out.println("please input min age");
        int minAge = Integer.parseInt(scanner.nextLine());
        System.out.println("please input max age");
        int maxAge = Integer.parseInt(scanner.nextLine());
        authorStorage.searchByAge(minAge, maxAge);
    }

    private static void printCommands() {
        System.out.println("please input " + EXIT + " for EXIT");
        System.out.println("please input " + ADD_AUTHOR + " for add author");
        System.out.println("please input " + SEARCH_AUTHORS + " for search author by name");
        System.out.println("please input " + SEARCH_AUTHORS_BY_AGE + " for search authors by age");
        System.out.println("please input " + PRINT_AUTHORS + " for print authors");
        System.out.println("please input " + ADD_BOOK + " for add book");
        System.out.println("please input " + SEARCH_BOOKS_BY_TITLE + " for searching books by title");
        System.out.println("please input " + SEARCH_BOOKS_BY_WRITER + " for searching books by writer");
        System.out.println("please input " + SEARCH_BOOKS_BY_PRICE + " for searching books by price");
        System.out.println("please input " + PRINT_BOOKS + " for print books");
    }

    private static void searchByName() {
        System.out.println("please input keyword");
        String keyword = scanner.nextLine();
        authorStorage.searchByName(keyword);
    }

    private static void addAuthor() {
        System.out.println("please input authors name");
        String name = scanner.nextLine();
        System.out.println("please input authors surname");
        String surname = scanner.nextLine();
        System.out.println("please input authors email");
        String email = scanner.nextLine();
        System.out.println("please input authors gender");
        String gender = scanner.nextLine();
        System.out.println("please input authors age");
        int age = Integer.parseInt(scanner.nextLine());

        Author author = new Author(name, surname, age, email, gender);
        authorStorage.add(author);
        System.out.println("Thank you, author was added");
    }
}
