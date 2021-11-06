package src.homework2.dynamicArray;

public class DynamicArrayTest {

    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        da.add(5);
        da.add(8);
        da.add(7);
        da.print();
        int byIndex = da.getByIndex(2);
        System.out.println(byIndex);

        da.print();

    }
}
