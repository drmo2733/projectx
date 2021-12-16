package src.part1.chapter14.example10;

public class RawDemo {
    public static void main(String[] args) {

        Gen<Integer> iOb = new Gen<>(88);

        Gen<String> strOb = new Gen<>("Tecт обобщений");

        //  Gen raw = new Gen(new Double(98.6));

        //  double d = (Double) raw.getob();
        //  System.out.println("Знaчeниe: " + d);

        //  strOb = raw;

        //  raw = iOb;
    }
}
