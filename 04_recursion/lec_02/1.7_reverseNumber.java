class RN{
    public static void main(String[] args){
        reverseNo(1234);
        System.out.println(sum);
        System.out.println(reverseNo2(1234));
    }

    // 1st may
    static int sum = 0;
    static void reverseNo(int n){
        if(n == 0){
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverseNo(n / 10);
    }s

    // 2nd way - using pure recursion
    static int reverseNo2(int n){
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