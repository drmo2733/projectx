package src.chapter9.example5;

public class NestedIfDemo {
    public static void main(String[] args) {

        A.NestedIf nif = new B();

        if (nif.isNotNegative(10))
            System.out.println("chislo 10 neotrecatelnoe");
        if (nif.isNotNegative(-12))
            System.out.println("eto ne budet vivedeno");
    }
}
