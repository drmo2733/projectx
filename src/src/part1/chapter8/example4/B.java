package src.part1.chapter8.example4;

public class B extends A {
    int i;

    B(int a, int b) {
        super.i = a;
        i = b;
    }

    void show() {
        System.out.println("chlen i v superklasse: " + super.i);
        System.out.println("chlen i v podklasse: " + i);
    }
}
