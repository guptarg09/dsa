package lec_05.AbstractDemo;

public class Main {

    public static void main() {
        Son son = new Son(30);
        son.carrer();

        Daughter daughter = new Daughter(27);
//        Parent daughter = new Daughter(27);    // you can also use it (applied the concept of runtime polymorphism)

        daughter.carrer();

        Parent.hello();
        Parent.normal();
    }
}
