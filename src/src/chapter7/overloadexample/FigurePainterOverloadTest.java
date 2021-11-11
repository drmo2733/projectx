package src.chapter7.overloadexample;

import src.homework.figurepainter.FigurePainter;

public class FigurePainterOverloadTest {
    public static void main(String[] args) {
        FigurePainterOverload fp = new FigurePainterOverload();
        fp.figureOne(5);

        fp.figureOne(4, '&');

        fp.figureOne(6, "(");

        fp.figureOne();




    }
}
