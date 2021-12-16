package src.chapter12.example5;

public class AutoBox3 {
    public static void main(String[] args) {
        Integer iOb, iOb2;
        int i;

        iOb=100;
        System.out.println("isxodnoe znachenie iOb: " + iOb);

        ++iOb;
        System.out.println("posle ++iob: " + iOb);

        iOb2 = iOb + (iOb / 3);
        System.out.println("iOb2 posle virazheniya: " + iOb2);

        i = iOb + (iOb / 3);
        System.out.println("i posle virazheniya: " + i);
    }
}
