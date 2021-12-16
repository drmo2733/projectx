package src.homework.homework1.arrayutil;


public class ArrayUtil {
    public static void main(String[] args) {

        int[] array = {7, 18, 22, 28, 33, 38, 55, 65, 73, 99};
//       1
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
//        2
        int maximum;
        maximum = array[0];

        for (int i = 1; i < array.length; i++) {

            if (array[i] > maximum) {
                maximum = array[i];
            }
        }
        System.out.println("maximum = " + maximum);

//        3
        int minimum;
        minimum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimum) {
                minimum = array[i];
            }

        }
        System.out.println("minimum = " + minimum);

//        4


        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {

                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

//          5

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
//           6
        int evenCount = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("count of even: " + evenCount);


//        7

        int oddCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 !=0){
                oddCount++;
            }
        }
        System.out.println("count of odd: " + oddCount);

//        8,9

        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("sum: " + sum);
        System.out.println("avg: " + sum / array.length);
    }
}


