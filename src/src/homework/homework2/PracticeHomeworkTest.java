package src.homework.homework2;

public class PracticeHomeworkTest {
    public static void main(String[] args) {
        PracticeHomework practiceHomework = new PracticeHomework();
        System.out.println(practiceHomework.convert(5));
        System.out.println(practiceHomework.calcAge(3));
        System.out.println(practiceHomework.nextNumber(5));
        System.out.println(practiceHomework.isSameNum(5,9));
        System.out.println(practiceHomework.lessThanOrEqualToZero(-55));
        System.out.println(practiceHomework.reverseBool(true));
        int[] array1 = {0,4,5,5,5,8,9};
        int[] array2 = {9,6,88,55,44,22};
        System.out.println(practiceHomework.maxLength(array1,array2));
    }

}
