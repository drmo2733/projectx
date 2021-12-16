package src.part1.chapter14.example5;

public class WildcardDemo {
    public static void main(String[] args) {
        Integer inums[] = {1, 2, 3, 4, 5};
        Stats<Integer> iOb = new Stats<>(inums);
        double v = iOb.average();
        System.out.println("Cpeднee значение iob равно " + v);

        Double dnums[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dOb = new Stats<>(dnums);
        double w = dOb.average();
        System.out.println("Cpeднee значение dob равно " + w);

        Float fnums[] = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Stats<Float> fOb = new Stats<>(fnums);
        double x = fOb.average();
        System.out.println("Cpeднee значение fob равно " + x);

        System.out.print("Cpeдниe значения iob и dob ");
        if (iOb.sameAvg(dOb))
            System.out.println("paвны.");
        else
            System.out.println("oтличaютcя.");

        System.out.print("Cpeдниe iob и fob ");
        if (iOb.sameAvg(fOb))
            System.out.println("oдинaкoвы. ");
        else
            System.out.println("oтличaютcя.");
    }
}
