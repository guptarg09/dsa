// it is just a class that contains only one object 
// if you want to create only one object then use the following method


// Singleton.java
public class Singleton {
    // Static variable to hold the single instance
    private static Singleton instance;

    // Private constructor to prevent instantiation
    private Singleton() {
        System.out.println("Singleton instance created.");
    }

    // Public method to provide access to the instance
    public static Singleton getInstance() {
        // Lazy initialization
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}








// Main.java
public class Main {
    public static void main(String[] args) {
        // All these calls will return the same instance
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();

        // Just to demonstrate that all are same
        System.out.println(obj1 == obj2); // true
        System.out.println(obj2 == obj3); // true
    }
}