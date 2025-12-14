package lec_03.Polymorphism;

public class Circle extends Shapes {

//    this will run when the object of circle is created (this is why it is called as runtime polymorphism)
//    hence it is override the parent method
    @Override  // this is called as annotation
    void area() {
        System.out.println("Area is 3.14 * r * r");
    }
}
