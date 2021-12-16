package src.part1.chapter12.example1;

public class EnumDemo4 {
    public static void main(String[] args) {
        Apple ap, ap2, ap3;
        System.out.println("vse konstanti sortov yablok i ix " +
                "poryadkovie znacheniya: ");
        for (Apple a : Apple.values())
            System.out.println(a + " " + a.ordinal());

            ap = Apple.RedDel;
            ap2 = Apple.GoldenDel;
            ap3 = Apple.RedDel;
            System.out.println();

            if (ap.compareTo(ap2) < 0 )
                System.out.println(ap + " predshestvuet " + ap2);
            if (ap.compareTo(ap2) > 0 )
                System.out.println(ap2 + " predshestvuet " + ap);
            if (ap.compareTo(ap3) == 0 )
                System.out.println(ap + " predshestvuet " + ap3);

            System.out.println();

            if (ap.equals(ap2))
                System.out.println("oshibka!");
            if (ap.equals(ap3))
                System.out.println(ap + " ravno " + ap3);
            if (ap == ap3)
                System.out.println(ap + " == " + ap3);
    }
}
