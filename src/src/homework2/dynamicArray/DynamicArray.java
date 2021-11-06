package src.homework2.dynamicArray;

public class DynamicArray {
    private int[] array = new int[10];
    private int size = 0;

    public void add(int value) {
        if (size == array.length) {
            extend();
        }
          array[size++]=value;
    }
    private void extend() {
        int[] newArray = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray = array;
    }
    public int getByIndex(int index) {
        if (index >=0 && index < size)
            return array[index];
        else
            return -1;
    }
    public void print() {
        for (int i = 0; i < size; i++) {
        }
    }
}
