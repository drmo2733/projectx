package src.homework.calc;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.plus(56,88));
        System.out.println(calculator.minus(88,77));
        System.out.println(calculator.divide(5,9));
        System.out.println(calculator.multiple(6,8));
    }
}
