package src.chapter8.kl;

public class AbstractAreas {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10,8);
        Figure figref;

        figref=r;
        System.out.println("ploshad ravna " + figref.area());

        figref = t;
        System.out.println("ploshad ravna " + figref.area());
    }
}
