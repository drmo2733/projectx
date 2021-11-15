package src.braceChecker;

public class BraceCheckerTest {

    public static void main(String[] args) {
        String text = "Hello (from) [J]av{a";
        BraceChecker braceChecker = new BraceChecker(text);
        braceChecker.check();

    }

}
