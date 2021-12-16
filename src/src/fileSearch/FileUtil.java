package src.fileSearch;

import java.io.*;
import java.util.Scanner;

public class FileUtil {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("please input path ");
        String pathstr = scanner.nextLine();
        File path = new File(pathstr);
    }
}
