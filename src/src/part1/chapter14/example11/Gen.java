package src.part1.chapter14.example11;

public class Gen <T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getob() {
        return ob;
    }
}
