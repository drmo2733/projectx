package src.chapter7;

public class PassObjRe {
    public static void main(String[] args) {
        Test3 ob=new Test3(15,20);
        System.out.println("ob.a i ob.b do vizova: "
                + ob.a + " " + ob.b);

        ob.meth(ob);

        System.out.println("ob.a i ob.b posle vizova: " +
                ob.a + " " + ob.b);
    }
}
