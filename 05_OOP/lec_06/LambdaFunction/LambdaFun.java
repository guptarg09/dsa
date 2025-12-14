package lec_06.LambdaFunction;

import java.util.ArrayList;

public class LambdaFun {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }

        // Using lambda in forEach
        list.forEach(item -> System.out.print(item * 2 + " "));
        System.out.println();

        // Lambda expressions for operations
        Operation sum = (a, b) -> a + b;
        Operation prod = (a, b) -> a * b;
        Operation sub = (a, b) -> a - b;

        // Creating object of LambdaFun
        LambdaFun myCalculator = new LambdaFun();

        // Using lambda operations
        System.out.println("Sum: " + myCalculator.operate(5, 3, sum));
        System.out.println("Product: " + myCalculator.operate(2, 8, prod));
        System.out.println("Subtraction: " + myCalculator.operate(5, 3, sub));
    }

    // Method that accepts functional interface
    private int operate(int a, int b, Operation op) {
        return op.operation(a, b);
    }

    // Functional interface
    interface Operation {
        int operation(int a, int b);
    }
}