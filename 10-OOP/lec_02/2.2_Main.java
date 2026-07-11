//  How to access non-static from static (the correct way)
class Demo {
    int num = 5;
    
    void display() {
        System.out.println("Num = " + num);
    }
    
    static void show() {
        Demo d = new Demo();  //  create object
        d.display();          // now call non-static method
    }
}

public class Main {
    public static void main(String[] args) {
        Demo.show();
    }
}
