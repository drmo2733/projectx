package src.chapter8.example7;

public class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("v oblasti chetirexugolnika");
        return dim1 * dim2;
    }
}
