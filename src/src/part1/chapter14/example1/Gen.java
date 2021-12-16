package src.part1.chapter14.example1;

public class Gen<T> {
    T ob;
    Gen(T o) {
        ob = o;
    }

    T getob() {
        return ob;
    }

    void showType() {
        System.out.println("Tипoм Т является " + ob.getClass().getName());
    }
}
