package src.part1.chapter9.example2.p1;

public class SamePackage {
    SamePackage() {
        Protection p = new Protection();
        System.out.println("kontruktor iz togo zhe samogo paketa");
        System.out.println("n = " + p.n);
//        System.out.println("n_pri = " + p.n_pri);
        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}
