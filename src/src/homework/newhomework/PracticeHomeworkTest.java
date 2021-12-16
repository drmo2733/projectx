package src.homework.newhomework;

public class PracticeHomeworkTest {
    public static void main(String[] args) {
        PracticeHomework practiceHomework = new PracticeHomework();
        System.out.println(practiceHomework.convert(20));
        System.out.println(practiceHomework.calcAge(18));
        System.out.println(practiceHomework.nextNumber(18));
        System.out.println(practiceHomework.isSameNum(18, 19));
        System.out.println(practiceHomework.lessThanOrEqualZero(18));
        System.out.println(practiceHomework.reverseBool(true));
        int[] array1 = {1,1,1,1,1,1,1,1};
        int[] array2 = {2,2,2,2,2,2,2,2,2,2};
        System.out.println(practiceHomework.maxLength(array1, array2));

    }
}
