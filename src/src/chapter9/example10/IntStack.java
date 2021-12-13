package src.chapter9.example10;

interface IntStack {
    void push(int item);
    int pop();

    default void clear() {
        System.out.println("metod clear() ne realizovan. ");
    }
}
