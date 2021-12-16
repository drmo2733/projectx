package src.homework.newhomework.array;

public class ArrayBolola {
    public static void main(String[] args) {
        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
//  1.
        int count = 0;
        for (int i = 0; i < bolola.length; i++) {
            char c = bolola[i];
            if (c == 'o') {
                count++;
            }
        }
        System.out.println(count++);

//  2.
        char[] boolola = {'b', 'o', 'l', 'o', 'l', 'a'};
        System.out.println(boolola[boolola.length / 2 - 1]);
        System.out.println(boolola[boolola.length / 2]);

//  3.
        char[] bollola = {'b', 'o', 'l', 'o', 'l', 'a'};
        if (bollola.length - 2 == 'l' && bollola.length - 1 == 'y') {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

//  4.
        char[] babola = {'b', 'a', 'b', 'o', 'l', 'a'};
        boolean isBob = false;
        for (int i = 0; i < babola.length - 2; i++) {
            if (babola[i] == 'b' && babola[i + 2] == 'b') {
                isBob = true;
                break;
            }

        }
        System.out.println(isBob);

//   5.
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
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


    }
}
