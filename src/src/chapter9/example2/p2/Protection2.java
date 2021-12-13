package src.chapter9.example2.p2;

import src.chapter9.example2.p1.Protection;

public class Protection2 extends Protection {
    Protection2() {
        System.out.println("konstruktor, unasledovanniy iz drugogo paketa");
//        System.out.println("n = " + n);
//        System.out.println("n_pri = " + n_pri);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
