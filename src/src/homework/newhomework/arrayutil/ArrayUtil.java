package src.homework.newhomework.arrayutil;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {3, 5, 9, 88, 4, 51, 62, 59, 84, 66};
//Տպեք մասիվի բոլոր էլեմենտները,
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

//Տպեք մասիվի ամենամեծ թիվը,
        int max;
        max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("max = " + max);

//        Տպեք մասիվի ամենափոքր թիվը,
        int min;
        min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min = " + min);

//     Տպեք մասիվի բոլոր զույգ էլեմենտները,
        int evens;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

//Տպեք մասիվի բոլոր կենտ էլեմենտները։
        int odds;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

//  Տպեք զույգերի քանակը։
        int evenCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("count of even = " + evenCount);

//   Տպեք կենտերի քանակը
        int oddcount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddcount++;
            }
        }
        System.out.println("count of odds = " + oddcount);

//  Տպեք մասիվի էլեմենտների գումարը։
//  Տպեք մասիվի բոլոր թվերի միջին թվաբանականը
        double sum =0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        System.out.println("sum = " + sum);
        System.out.println("avg = " + sum/array.length);


    }
}
