package src.homework2;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {5, 64, 58, 94, 5, 8, 66, 33, 88, 18};
        arrayUtil.print(array);
        int arrayMax = arrayUtil.max(array);
        System.out.println(arrayMax);
        int arrayMin = arrayUtil.min(array);
        System.out.println(arrayMin);
        int arrayEvens = arrayUtil.evens(array);
        System.out.println(arrayEvens);
    }
}
