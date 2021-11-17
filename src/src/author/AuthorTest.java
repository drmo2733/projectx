package src.author;

import java.util.Scanner;

public class AuthorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many authors we have");
        int operation = scanner.nextInt();
        AuthorStorage authorStorage = new AuthorStorage();

        for (int i = 0; i < operation; i++) {
            System.out.println("authors name");
            String name = scanner.next();
            System.out.println("authors surname");
            String surname = scanner.next();
            System.out.println("authors email");
            String email = scanner.next();
            System.out.println("authors age");
            int age = scanner.nextInt();
            System.out.println("authors gender");
            String gender = scanner.next();
            Author author = new Author(name, surname, email, age,gender);
            authorStorage.add(author);

        }
        authorStorage.print();



    }

}
