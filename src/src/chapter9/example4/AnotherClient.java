package src.chapter9.example4;

public class AnotherClient implements Callback {
    public void callback(int p) {
        System.out.println("esho odin variant metoda callback() ");
        System.out.println("p v kvadrate ravno " + (p * p));
    }
}
