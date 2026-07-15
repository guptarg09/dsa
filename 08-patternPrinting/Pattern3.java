import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        pattern(n);
    }
    public static void pattern(int n) {
        for(int row = 1; row <= n; row++) {
            for(int col = n; col >= row; col--) { // you can also use it: for(int col = 1; col <= n-row+1; col++)
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}