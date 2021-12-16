package src.part1.chapter12.example5;

public class AutoBox5 {
    public static void main(String[] args) {

        Boolean b = true;

        if (b) System.out.println("b ravno true");

        Character ch = 'x';
        char ch2 = ch;
        System.out.println("ch2 ravno " + ch2);
    }
}
