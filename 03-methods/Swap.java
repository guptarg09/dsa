public class Swap {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        swap(a, b);

        System.out.println(a + " " + b);

        String name = "Ritesh Gupta";
        changeName(name);
        System.out.println(name);
    }

    static void changeName(String naam) {
        naam = "Rahul Rana"; // creating a new object
    }

    static void swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }
}