package src.part1.chapter7;

public class TestStack {
    public static void main(String args[]) {
        Stack mystackl = new Stack();
        Stack mystack2 = new Stack();

        for (int i = 0; i < 10; i++) mystackl.push(i);
        for (int i = 10; i < 20; i++) mystack2.push(i);

        System.out.println("Стек в mystackl: ");
        for (int i = 0; i < 10; i++)
            System.out.println(mystackl.pop());
        System.out.println("Стек в mystack2: ");
        for (int i = 0; i < 10; i++)
            System.out.println(mystack2.pop());

    }
}