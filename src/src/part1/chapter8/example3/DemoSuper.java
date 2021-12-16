package src.part1.chapter8.example3;

public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight mybox1 =new BoxWeight(10,20,15,34.3);
        BoxWeight mybox2 = new BoxWeight(2,3,4,0.076);
        BoxWeight mybox3 = new BoxWeight();
        BoxWeight mycube = new BoxWeight(3,2);
        BoxWeight myclone = new BoxWeight(mybox1);
        double vol;

        vol= mybox1.volume();
        System.out.println("obyom mybox1 raven " + vol);
        System.out.println("ves mybox1 raven " + mybox1.weight);
        System.out.println();

        vol= mybox2.volume();
        System.out.println("obyom mybox2 raven " + vol);
        System.out.println("ves mybox2 raven " + mybox2.weight);
        System.out.println();

        vol= mybox3.volume();
        System.out.println("obyom mybox3 raven " + vol);
        System.out.println("ves mybox3 raven " + mybox3.weight);
        System.out.println();

        vol= myclone.volume();
        System.out.println("obyom myclone raven " + vol);
        System.out.println("ves myclone raven " + myclone.weight);
        System.out.println();

        vol= mycube.volume();
        System.out.println("obyom mycube raven " + vol);
        System.out.println("ves mycube raven " + mycube.weight);
        System.out.println();
    }
}
