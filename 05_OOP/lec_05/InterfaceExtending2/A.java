package lec_05.InterfaceExtending2;

public interface A {
    default void fun() {
        System.out.println("I am in A");
    }


//    static interface method should always have a body
    static void fun2() {
        System.out.println("I am static method");
    }
}
