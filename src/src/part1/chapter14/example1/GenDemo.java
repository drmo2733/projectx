package src.part1.chapter14.example1;

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb;

        iOb = new Gen<>(88);

        iOb.showType();

        int v = iOb.getob();
        System.out.println("Знaчeниe: " + v);
        System.out.println();

        Gen<String> strOb = new Gen<>("Тест обобщений");

        strOb.showType();

        String str = strOb.getob();
        System.out.println("Знaчeниe: " + str);
    }
}
