package src.part1.chapter9.example1;

public class Balance {
    String name;
    double bal;

    Balance(String n, double b) {
        name = n;
        bal = b;
    }

    void show() {
        if (bal < 0)
            System.out.print("-->");
        System.out.println(name + ": $" + bal);
    }
}
