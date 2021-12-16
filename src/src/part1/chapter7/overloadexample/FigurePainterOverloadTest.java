package src.part1.chapter7.overloadexample;

public class FigurePainterOverloadTest {
    public static void main(String[] args) {
        FigurePainterOverload fp = new FigurePainterOverload();
        fp.figureOne(5);

        fp.figureOne(4, '&');

        fp.figureOne(6, "(");

        fp.figureOne();




    }
}
