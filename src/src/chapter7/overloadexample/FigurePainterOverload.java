package src.chapter7.overloadexample;

public class FigurePainterOverload {

    void figureOne(int n, String s) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(s +" ");
            }
            System.out.println();
        }
    }
    void figureOne(int n, char c) {
        figureOne(n,c+ "");

    }

    void figureOne(int n) {
        figureOne(n, '*');
    }

    void figureOne() {
        figureOne(5, '*');
    }
}
