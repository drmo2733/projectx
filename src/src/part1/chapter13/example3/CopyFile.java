package src.part1.chapter13.example3;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException{
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        if (args.length != 2) {
            System.out.println("ispolzovanie: CopyFile otkuda kuda");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);

            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            }while (i != -1);
        }catch (IOException e) {
            System.out.println("oshibka vvoda-vivoda: " + e);
        }finally {
            try {
                if (fin!=null) fin.close();
            }catch (IOException e2) {
                System.out.println("oshibka zakritiya fayla vvoda");
            }
            try {
                if (fout != null) fout.close();
            }catch (IOException e2) {
                System.out.println("oshibka zakritiya fayla vivoda");
            }
        }
    }
}
