package src.part1.chapter9.example2.p1;

public class Derived extends Protection{
    Derived() {
        System.out.println("konstruktor podklassa");
        System.out.println("n = " + n);
//        System.out.println("n_pri = " + n_pri);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
