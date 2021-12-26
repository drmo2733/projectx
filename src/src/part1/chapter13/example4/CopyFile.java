package src.part1.chapter13.example4;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        int i;

        if (args.length != 2) {
            System.out.println("ispolzovanie: CopyFile otkuda kuda");
            return;
        }
        try (FileInputStream fin = new FileInputStream(args[0]);
        FileOutputStream fout = new FileOutputStream(args[1])){
            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            }while (i !=-1);
        }catch (IOException e) {
            System.out.println("oshibka vvoda-vivoda" + e);
        }
    }
}
