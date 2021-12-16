package src.part1.chapter13.example3;

import java.io.*;

public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;

        if (args.length != 1) {
            System.out.println("Ispolzovanie: ShowFile imya_fayla");
            return;
        }
        try {
            fin = new FileInputStream(args[0]);
        }catch (FileNotFoundException e) {
            System.out.println("nevazmozhno otkrit fayl");
            return;
        }
        try {
            do {
                i = fin.read();
                if (i != -1) System.out.println((char) i);
            } while (i != - 1);
        }catch (IOException e) {
            System.out.println("oshibka chteniya iz fayla");
        }
        try {
            fin.close();
        }catch (IOException e) {
            System.out.println("oshibka zakritiya fayla");
        }
    }
}
