package src.part1.chapter5;

public class Menu {
    public static void main(String[] args)
            throws java.io.IOException {
        char choice;
        do {
            System.out.println("Spravka po operatoru:");
            System.out.println(" 1. if");
            System.out.println(" 2. switch");
            System.out.println(" 3. while");
            System.out.println(" 4. do-while");
            System.out.println(" 5. for\n");
            System.out.println("Viberite nuzhniy punkt:");
            choice = (char) System.in.read();
        } while (choice < '1' || choice > '5');

        System.out.println("\n");

        switch (choice) {
            case '1':
                System.out.println("if:\n");
                System.out.println("if(uslovie) operator;");
                System.out.println("else operator;");
                break;
            case '2':
                System.out.println("switch:\n");
                System.out.println("switch (virazhenie) ");
                System.out.println(" case konstanta:");
                System.out.println(" podledovatelnost operatorov");
                System.out.println(" break;");
                System.out.println(" // ...");
                System.out.println(")");
                break;
            case '3':
                System.out.println("while:\n");
                System.out.println("while(uslovie) operator;");
                break;
            case '4':
                System.out.println("do-while:\n");
                System.out.println("do (");
                System.out.println("     operator;");
                System.out.println(") while (uslovie);");
                break;
            case '5':
                System.out.println("for:\n");
                System.out.println("for(inicializacia; uslovie; iteracia)");
                System.out.println(" operator;");
                break;
        }


        }
    }
