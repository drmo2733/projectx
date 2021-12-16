package src.part1.chapter7;

public class OverloadDemo1 {
    void test () {
        System.out.println("parametri otsutstvuyut");
    }
    void test (int a, int b) {
        System.out.println("a i b: " + a + " " + b);
    }
    void test (double a) {
        System.out.println("vnutrennoe preobrazovanie pri " +
                "vizove test(double) a: " + a);
    }
}
