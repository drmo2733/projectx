package src.part1.chapter8.example5;

public class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10,20,15,10,3.41);
        Shipment shipment2 = new Shipment(2,3,4,0.76,1.28);

        double vol;
        vol= shipment1.volume();
        System.out.println("obyom shipment1 raven " + vol);
        System.out.println("ves shipment1 raven " + shipment1.weight);
        System.out.println("stoimost dostavki: $" + shipment1.cost);
        System.out.println();

        vol= shipment2.volume();
        System.out.println("obyom shipment2 raven " + vol);
        System.out.println("ves shipment2 raven " + shipment2.weight);
        System.out.println("stoimost dostavki: $" + shipment2.cost);
    }
}
