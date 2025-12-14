package lec_05.InterfaceExtending2;

public class Main implements B, A {

    @Override
    public void greet() {
        System.out.println("I am in B");
    }

    public static void main() {
        A a = new Main();
        a.fun();

        B b = new Main();
        b.greet();


        A.fun2();
    }
}
