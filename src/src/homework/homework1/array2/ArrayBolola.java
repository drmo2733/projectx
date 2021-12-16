package src.homework.homework1.array2;

public class ArrayBolola {
    public static void main(String[] args) {
        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};

        int count = 0;
        for (int i = 0; i < bolola.length; i++) {
            char c = bolola[i];
            if (c == 'o') {
                count++;
            }
        }
        System.out.println("count of o = " + count);


        char[] bololaa = {'b', 'o', 'l', 'o', 'l', 'a'};
        System.out.print(bololaa[bololaa.length / 2 - 1]);
        System.out.println(bololaa[bololaa.length / 2]);


        char[] bollola = {'b', 'o', 'l', 'o', 'l', 'a'};
        if (bollola.length - 2 == 'l' && bollola.length - 1 == 'y') {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        char[] bbolola = {'b', 'a', 'b', 'o', 'l', 'a'};
        boolean isBob = false;
        for (int i = 0; i < bbolola.length - 2; i++) {
            if (bbolola[i] == 'b' && bbolola[i + 2] == 'b') {
                isBob = true;
                break;
            }

        }
        System.out.println(isBob);


        char[] text = {' ', ' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        int startIndex = 0;
        int endIndex = text.length - 1;

        while (startIndex < endIndex && text[startIndex] == ' ') {
            startIndex++;
        }
        while (startIndex < endIndex && text[endIndex] == ' ') {
            endIndex--;
        }
        char[] result = new char[(endIndex - startIndex) + 1];


        int index = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            result[index++] = text[i];
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
//


    }

}
