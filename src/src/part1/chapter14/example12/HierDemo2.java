package src.part1.chapter14.example12;

public class HierDemo2 {
    public static void main(String[] args) {

        Gen<String> w = new Gen<>("Добро пожаловать", 47);
        System.out.print(w.getOb() + " ");
        System.out.println(w.getNum());
    }
}
