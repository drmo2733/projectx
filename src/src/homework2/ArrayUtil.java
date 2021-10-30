package src.homework2;

public class ArrayUtil {

    void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    void evens(int[] array) {
        int evens = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evens = array[i];
                System.out.print(evens + " ");
            }
        }
        System.out.println();

    }

    void odds(int[] array) {
        int odds = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                odds = array[i];
                System.out.print(odds + " ");
            }
        }
        System.out.println();
    }

    int evenCount(int[] array) {
        int evenCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenCount++;
            }
        }
        return evenCount;
    }

    int oddCount(int[] array) {
        int oddCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddCount++;
            }
        }
        return oddCount;
    }

    double sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    double avg(int[] array) {
        int avg = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            avg = sum / array.length;
        }
        return avg;
    }
}
