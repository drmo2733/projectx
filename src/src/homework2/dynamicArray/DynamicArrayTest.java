package src.homework2.dynamicArray;

public class DynamicArrayTest {

    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        da.add(5);
        da.add(8);
        da.add(7);
        da.add(4);
        da.add(99);
        da.add(18);

        int byIndex = da.getByIndex(5);
        System.out.println(byIndex);

        da.print();


    }
}
