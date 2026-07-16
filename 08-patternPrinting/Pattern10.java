import java.util.Scanner;
public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();
        pattern(n);
    }
    public static void pattern(int n) {
        for(int row = 1; row <= 2 * n - 1; row++) {
            
            int c = row > n ? 2 * n - row : row;
            
            
            for(int space = 0; space < n - c; space++){
                System.out.print("  ");
            }
            for(int col = c; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for(int col = 2; col <= c; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}