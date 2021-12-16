package src.part1.chapter14.example2;

public class NonGenDemo {
    public static void main(String[] args) {
        NonGen iOb;

        iOb = new NonGen(99);

        iOb.showType();
        int v = (Integer) iOb.getOb();
        System.out.println("Знaчeниe: " + v);
        System.out.println();

        NonGen strOb = new NonGen("Tecт без обобщений");

        strOb.showType();

        String str = (String) strOb.getOb();
        System.out.println("Знaчeниe: " + str);
    }
}
