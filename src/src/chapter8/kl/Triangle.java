package src.chapter8.kl;

import src.chapter8.kl.Figure;

public class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("v oblasti treugolnika");
        return dim1 * dim2 / 2;
    }
}
