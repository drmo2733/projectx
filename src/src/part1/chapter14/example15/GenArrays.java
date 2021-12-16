package src.part1.chapter14.example15;

public class GenArrays {
    public static void main(String[] args) {
        Integer n[] = {1, 2, 3, 4, 5};

        Gen<Integer> iOb = new Gen<>(50, n);

        Gen<?> gens[] = new Gen<?>[10];
    }
}
