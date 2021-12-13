package src.chapter10.example11;

public class ChainExcDemo {
    static void demoproc() {
        NullPointerException e = new NullPointerException("verxniy uroven");
    e.initCause(new ArithmeticException("prichina"));
    throw e;
    }

    public static void main(String[] args) {
        try {
            demoproc();
        }catch (NullPointerException e) {
            System.out.println("perexvacheno isklyuchenie: " + e);
            System.out.println("pervaprichina: " + e.getCause());
        }
    }
}
