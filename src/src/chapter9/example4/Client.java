package src.chapter9.example4;

public class Client implements Callback {
    public void callback(int p) {
        System.out.println("metod callback() vizivaemiy so " +
                "znacheniem" + p);
    }

    void nonIfaceMeth() {
        System.out.println("V klassax, realizuyushix interfeysi, mogut" +
                "opredelyatsa i drugie chleni");
    }
}
