package src.part1.chapter14.example14;

public class Gen <T>{
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getob() {
        System.out.print("Meтoд getob() из класса Gen: ");
        return ob;
    }
}
