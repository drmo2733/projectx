package src.part1.chapter7.part2;

public class Outer2 {
    int outer_x = 100;

    void test() {
        for (int i = 0; i <10 ; i++) {
            class Inner{
                void display() {
                    System.out.println(
                            "vivod: outer_x = " + outer_x
                    );
                }
            }
            Inner inner = new Inner();
            inner.display();

        }
    }
}
