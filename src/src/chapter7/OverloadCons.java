package src.chapter7;

import src.chapter7.Box;

public class OverloadCons {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        double vol;

        vol = mybox1.volume();
        System.out.println("obyom mybox1 raven " + vol);

        vol = mybox2.volume();
        System.out.println("obyom mybox2 raven " + vol);

        vol = mycube.volume();
        System.out.println("obyom mycube raven " + vol);

    }
}
