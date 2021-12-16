package src.part1.chapter10.example9;

public class FinallyDemo {
    static void procA() {
        try {
            System.out.println("v tele metoda procA()");
            throw new RuntimeException("demonstracia");
        }finally {
            System.out.println("blok operatora  finally  v " +
                    "metode procA()");
        }
    }

    static void procB() {
        try {
            System.out.println("v tele metoda  procB()");
            return;
        }finally {
            System.out.println("blok operatora  finally  v " +
                    "metode procB()");
        }
    }

    static void procC() {
        try {
            System.out.println("v tele metoda procC()");
        }finally {
            System.out.println("blok operatora  finally  v" +
                    "metode procC()");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        }catch (Exception e) {
            System.out.println("isklyuchenie perexvacheno");
        }
        procB();
        procC();
    }
}
