package src.part1.chapter12.example6;

public class UnboxingError {
    public static void main(String[] args) {

        Integer iOb = 1000;

        int i = iOb.byteValue();
        System.out.println(i);
    }
}