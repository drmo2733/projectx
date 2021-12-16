package src.part1.chapter13.example2;

import java.io.*;

public class BRReadLines {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String str;
        System.out.println("vvedite stroki teksta");
        System.out.println("vvedite 'stop' dlya zaversheniya");
        do {
            str=br.readLine();
            System.out.println(str);
        }while (!str.equals("stop"));

    }
}
