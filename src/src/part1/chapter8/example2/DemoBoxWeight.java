package src.part1.chapter8.example2;

public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10,20,15,34.3);
        BoxWeight mybox2 = new BoxWeight(2,3,4,0.076);
        double vol;

        vol= mybox1.volume();
        System.out.println("Obyom mybox1 raven " + vol);
        System.out.println("Ves mybox1 raven " + mybox1.weight);
        System.out.println();

        vol= mybox2.volume();
        System.out.println("Obyom mybox2 raven " + vol);
        System.out.println("Ves mybox2 raven " + mybox2.weight);
    }
}
