package src.part1.chapter7.part2;

public class Outer1 {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }
    class Inner{
        int y = 10;

        void display() {
            System.out.println("vivod: outer_x = " + outer_x);
        }
    }

}
