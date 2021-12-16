package src.part1.chapter14.example15;

public class Gen <T extends Number> {
    T ob;

    T vals[];

    Gen(T o, T[] nums) {
        ob = o;
        vals = nums;
    }
}
