package src.part1.chapter13.example5;

public class InstanceOf {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();


        if (a instanceof A)
            System.out.println("a yavlyaetsya ekzemplyarom A");
        if (b instanceof B)
            System.out.println("b yavlyaetsya ekzemplyarom B");
        if (c instanceof C)
            System.out.println("c yavlyaetsya ekzemplyarom C");
        if (c instanceof A)
            System.out.println("c mozhno privesti k tipu A");
        if (a instanceof C)
            System.out.println("a mozhno privesti k tipu C");
        System.out.println();


        A ob;
        ob = d;
        System.out.println("ob teper ssilaetsya na d");
        if (ob instanceof D)
            System.out.println("ob yavlyaetsya ekzemplyarom D");
        System.out.println();


        ob = c;
        System.out.println("ob teper ssilaetsya na c");
        if (ob instanceof D)
            System.out.println("ob mozhno privesti k tipu D");
        else
            System.out.println("ob nelzya privesti k tipu D");
        if (ob instanceof A)
            System.out.println("ob mozhno privesti k tipu A");
        System.out.println();


        if (a instanceof Object)
            System.out.println("a mozhno privesti k tipu Object");
        if (b instanceof Object)
            System.out.println("b mozhno privesti k tipu Object");
        if (c instanceof Object)
            System.out.println("c mozhno privesti k tipu Object");
        if (d instanceof Object)
            System.out.println("d mozhno privesti k tipu Object");
    }
}
