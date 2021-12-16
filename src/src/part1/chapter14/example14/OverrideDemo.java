package src.part1.chapter14.example14;

public class OverrideDemo {
    public static void main(String[] args) {

        Gen<Integer> iOb = new Gen<>(88);

        Gen2<Integer> iOb2 = new Gen2<>(99);

        Gen2<String> strOb2 = new Gen2<>("Тест обобщений");
        System.out.println(iOb.getob());
        System.out.println(iOb2.getob());
        System.out.println(strOb2.getob());
    }
}
