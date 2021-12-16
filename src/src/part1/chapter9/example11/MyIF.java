package src.part1.chapter9.example11;

public interface MyIF {

    int getNumber();

    default String getString() {
        return "Obyekt tipa String po umolchaniyu";
    }

    static int getDefaultNumber() {
        return 0;
    }
}
