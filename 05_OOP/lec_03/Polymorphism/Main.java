package lec_03.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Shapes square = new Square();

        shape.area();
        circle.area();
        square.area();

        Shapes circle2 = new Circle();
        circle2.area();
    }
}
