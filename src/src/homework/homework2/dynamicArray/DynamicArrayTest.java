package src.homework.homework2.dynamicArray;

public class DynamicArrayTest {

    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();

        da.add(5);

        int[] numbers = {33, 44, 55};

        da.add(numbers);

        da.print();

        System.out.println(da.isEmpty());
        da.add(66, 2);

        da.print();
        System.out.println(da.isExists(66));
    }
}
