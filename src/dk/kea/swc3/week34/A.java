package dk.kea.swc3.week34;

/**
 * Created by coag on 30-08-2016.
 */
public class A {

    public String f(A par) {
        return "9";
    }

    public String f(B par) {
        return "2";
    }
}


class B extends A{

    public String f(A par) {
        return "1";
    }

    static String run() {
        B x = new B();
        A y = new B();
        A z = new A();
        return x.f((A) new B()) + x.f(new B()) + y.f(new A())
                + y.f((A) new B()) + z.f(new A());
    }

    public static void main(String[] args) {
        System.out.println(run());
    }
}
