class RN{
    public static void main(String[] args){
        int n = 12231;
        System.out.println(isPalindrome(n));
    }

    static boolean isPalindrome(int n){
        if(n == reverse(n)){
            return true;
        }
        return false;
    }
    static int reverse(int n){
        int digits = (int)(Math.log10(n) + 1);
        return healper(n, digits);
    }
    static int healper(int n, int digits){
        if(n % 10 == n){
            return n;
        }
        int rem = n % 10;
        return rem * (int)Math.pow(10, digits-1) + healper(n/10, digits-1);
    }
}