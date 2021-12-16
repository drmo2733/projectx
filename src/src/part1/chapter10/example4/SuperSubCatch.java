package src.part1.chapter10.example4;

public class SuperSubCatch {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42/a;
        }catch (Exception e) {
            System.out.println("perexvat isklyucheniy obshego" +
                    "klassa Exception");
//        }catch (ArithmeticException e) {
            System.out.println("etot kod vapshe nedastizhim");
        }
    }
}
