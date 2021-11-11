package src.homework.figurepainter;

public class FigurePainter {

    void figureOne(int n, char c) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(c +" ");
            }
            System.out.println();
        }
    }

    void figureTwo(int n, char c) {
        for (int i = 0; i < n; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(c +" ");

            }
            System.out.println();
        }
    }

    void figureThree(int n, char c) {
        for (int i = 0; i < n; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(c +" ");
            }
            System.out.println();
        }
    }

    void figureFour(int n, char c) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 4; j > i; j--) {
                System.out.print(c +" ");
            }
            System.out.println();

        }
    }

    void figureFive(int n, char c) {
        for (int i = 0; i < n; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(c +"   ");

            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 4; j > i; j--) {
                System.out.print(c +"   ");
            }
            System.out.println();
        }

    }
}
