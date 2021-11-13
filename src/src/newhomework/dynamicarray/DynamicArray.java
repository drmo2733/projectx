package src.newhomework.dynamicarray;

public class DynamicArray {

    private int[] array = new int[10];
    //    sa mer masivi mej avelacvac elementneri qanakn e
    private int size = 0;

    //  stugel ete masivi mej tex chka-> kanchel extend()
//    ev avelacnenq
    public void add(int value) {
        if (array.length == size) {
            extend();
        }
        array[size++] = value;
    }

    //  1.stexcel hin masivic 10 element aveli mec masiv
//  2. qcel hin masivi elementner@ nori mej
//  3. hin masivi hxum@ kapenq nor masivi hxman het
    private void extend() {
        int[] newArray = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    //  ete trvac index@ mer unecac masivi indexi sahmannerum e
//  veradarcnel masivi index-ereord element@: Hakarak depqum
//    veradarcnel -1
    public int getByIndex(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        }
        return -1;
    }

    //    tpel masivi avelacvac elementner@
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }


    }
}
