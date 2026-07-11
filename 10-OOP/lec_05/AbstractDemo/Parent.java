package lec_05.AbstractDemo;

public abstract class Parent {


    int age;
    final int value;   // we can declare a variable as final in abstract class

    public Parent() {
        this.value = 32;
    }


//    abstract Parent(){}    you can't cerate the constructor abstract


//    you can't create the object of abstract class because if you are able to create the object of Parent class and you are trying to call the Carrer class then it will show you error


//    abstract static void abs();    --> you can't create abstract static methods
//    but you can create static method in abstract classes
    static void hello() {
        System.out.println("hello from static method");
    }

    static void normal(){
        System.out.println("hello from a normal methos");
    }
    abstract void carrer();
    abstract void partner();


}
