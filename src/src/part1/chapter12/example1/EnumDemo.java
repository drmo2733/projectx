package src.part1.chapter12.example1;

public class EnumDemo {
    public static void main(String[] args) {
        Apple ap;

        ap = Apple.RedDel;
        System.out.println("znachenie ap: " + ap);
        System.out.println();

        ap = Apple.GoldenDel;
        if (ap==Apple.GoldenDel)
            System.out.println("peremmennaya ap soderzhit GoldenDel.\n");

        switch (ap) {
            case Jonathan -> System.out.println("sort Jonathan krasniy");
            case GoldenDel -> System.out.println("sort Golden Delicious zheltiy");
            case RedDel -> System.out.println("sort Red Delicious krasniy");
            case Winesap -> System.out.println("sort Winesap krasniy");
            case Cortland -> System.out.println("sort Cortland krasniy");
        }
    }
}
