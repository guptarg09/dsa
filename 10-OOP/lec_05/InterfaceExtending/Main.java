package lec_05.InterfaceExtending;

public class Main implements B {

    @Override
    public void fun() {
        System.out.println("fun");
    }

    @Override
    public void greet() {
        System.out.println("greet");
    }

    public static void main(String[] args) {
        B b = new Main();
        b.greet();
        b.fun();
    }
}
