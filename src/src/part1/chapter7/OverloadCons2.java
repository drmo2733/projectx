package src.part1.chapter7;

public class OverloadCons2 {
    public static void main(String[] args) {
        Box2 mybox1 = new Box2(10, 20, 15);
        Box2 mybox2 = new Box2();
        Box2 mycube = new Box2(7);
        Box2 myclone = new Box2(mybox1);

        double vol;
        vol = mybox1.volume();
        System.out.println("obyom mybox1 raven " + vol);

        vol = mybox2.volume();
        System.out.println("obyom mybox2 raven " + vol);

        vol = mycube.volume();
        System.out.println("obyom kuba raven " + vol);

        vol = myclone.volume();
        System.out.println("obyom klona raven " + vol);
    }
}
