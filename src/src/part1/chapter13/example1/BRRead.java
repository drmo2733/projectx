package src.part1.chapter13.example1;

import java.io.*;

public class BRRead {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader
                (new InputStreamReader(System.in));
        System.out.println("vvedite simvoli, 'q' -- dlya vixoda.");
        do {
            c = (char) br.read();
            System.out.println(c);
        }while (c != 'q');
    }
}
