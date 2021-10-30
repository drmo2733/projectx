package src.homework2;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {5, 64, 58, 94, 5, 8, 66, 33, 88, 18};
        arrayUtil.print(array);
        int arrayMax = arrayUtil.max(array);
        System.out.println("max = " + arrayMax);
        int arrayMin = arrayUtil.min(array);
        System.out.println("min = " + arrayMin);
        arrayUtil.evens(array);
        arrayUtil.odds(array);
        int evenCount = arrayUtil.evenCount(array);
        System.out.println("even count = " + evenCount);
        int oddCount = arrayUtil.oddCount(array);
        System.out.println("odd count = " + oddCount);
        double sum = arrayUtil.sum(array);
        System.out.println("sum = " + sum);
        System.out.println("avg = " + sum/ array.length);
        double avg = arrayUtil.avg(array);
        System.out.println(avg);


    }
}
