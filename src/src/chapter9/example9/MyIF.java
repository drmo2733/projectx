package src.chapter9.example9;

public interface MyIF {

    int getNumber();

    default String getString() {
        return "Obyekt tipa String po umolchaniu";
    }
}
