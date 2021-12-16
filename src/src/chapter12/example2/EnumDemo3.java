package src.chapter12.example2;

public class EnumDemo3 {
    public static void main(String[] args) {
        Apple ap;

        System.out.println("Yabloko sorta Winesap stoit " +
                Apple.Winesap.getPrice() + " centov.\n");
        System.out.println("ceni na vse sorta yablok:");
        for (Apple a : Apple.values()) {
            System.out.println(a + " stoit " + a.getPrice() + " centov.");
        }
    }
}
