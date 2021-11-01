package src.homework2;

public class PracticeHomework {
    long convert(int minutes) {
        int seconds = minutes * 60;
        return seconds;
    }

    int calcAge(int years) {
        int days = years * 365;
        return days;
    }

    int nextNumber(int number) {
        int next = number + 1;
        return next;
    }

    boolean isSameNum(int a, int b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

    boolean lessThanOrEqualToZero(int number) {
        if (number <= 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean reverseBool(boolean value) {
        return !value;
    }

    int maxLength(int[] array1, int[] array2) {

        if (array1.length > array2.length) {
            return array1.length;
        } else {
            return array2.length;
        }
    }
}
