package src.part1.chapter9.example6;

public class IFTest {
    public static void main(String[] args) {

        FixedStack mystack1 = new FixedStack(5);
        FixedStack mystack2 = new FixedStack(8);

        for (int i = 0; i < 5; i++) mystack1.push(i);
        for (int i = 0; i < 8; i++) mystack2.push(i);

        System.out.println("stek v mysteck1: ");
        for (int i = 0; i < 5; i++)
            System.out.println(mystack1.pop());

        System.out.println("stek v mysteck2: ");
        for (int i = 0; i < 8; i++)
            System.out.println(mystack2.pop());


    }
}
