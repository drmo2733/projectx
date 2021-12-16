package src.part1.chapter9.example2.p2;

import src.part1.chapter9.example2.p1.Protection;

public class OtherPackage {
    OtherPackage() {
        Protection p = new Protection();
        System.out.println("konstruktor iz drugogo paketa");
//        System.out.println("n = " + n);
//        System.out.println("n_pri = " + p.n_pri);
//        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pro = " + p.n_pub);
    }
}
