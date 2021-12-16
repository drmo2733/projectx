package src.part1.chapter13.example4;

import java.io.*;

public class ShowFile {
    public static void main(String[] args) {
        int i;

        if (args.length != 1) {
            System.out.println("ispolzovanie: ShowFile imya_fayla");
            return;
        }
        try(FileInputStream fin = new FileInputStream(args[0])) {
            do {
                i = fin.read();
                if (i != -1) System.out.println((char) i);
            } while (i != -1);
        }catch (FileNotFoundException e) {
            System.out.println("fayl ne nayden");
        }catch (IOException e) {
            System.out.println("proizashla oshibka vvoda-vivoda");
        }
    }
}
