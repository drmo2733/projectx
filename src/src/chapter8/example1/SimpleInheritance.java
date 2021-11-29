package src.chapter8.example1;

public class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        superOb.i=10;
        superOb.j=20;
        System.out.println("soderzhimoe obyekta superOb: ");
        superOb.showij();
        System.out.println();

        subOb.i=7;
        subOb.j=8;
        subOb.k=9;
        System.out.println("soderzhimoe obyekta subOb: ");
        subOb.showij();
        subOb.showk();

        System.out.println();
        System.out.println("summa i,j,k v obyekte subOb: ");
        subOb.sum();
    }
}
