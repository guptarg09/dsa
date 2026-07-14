import java.util.Scanner;
public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        pattern(n);
    }
    public static void pattern(int n) {
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= row; col++) {
                System.out.print(col );
            }
            System.out.println();
        }
    }
}