package src.part1.chapter13.example3;

import java.io.*;

public class ShowFile2 {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;

        if (args.length!=-1) {
            System.out.println("Ispolzovanie: ShowFile imya_fayla");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);

            do {
                i = fin.read();
                if (i != -1) System.out.println((char) i);
            }while (i !=-1);
        }catch (FileNotFoundException e) {
            System.out.println("fayl ne nayden");
        }catch (IOException e) {
            System.out.println("proizashla oshibka vvoda-vivoda");
        }finally {
            try {
                if (fin != null) fin.close();
            }catch (IOException e) {
                System.out.println("oshibka zakritiya fayla");
            }
        }
    }
}
