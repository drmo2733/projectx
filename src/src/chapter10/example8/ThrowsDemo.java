package src.chapter10.example8;

public class ThrowsDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.println("v tele metoda throwOne()");
        throw new IllegalAccessException("demonstracia");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        }catch (IllegalAccessException e) {
            System.out.println("perexvacheno isklyuchenie: " + e);
        }
    }
}
