package src.chapter7.part2;

public class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer1 outer1 = new Outer1();
        Outer2 outer2 = new Outer2();
        outer.test();
        outer1.test();
        outer2.test();
    }
}
