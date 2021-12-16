package src.part1.chapter14.example12;

public class Gen <T> extends NonGen{
    T ob;

    Gen(T o, int i) {
        super(i);
        ob = o;
    }

    T getOb() {
        return ob;
    }
}
