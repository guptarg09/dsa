class CZ{
    public static void main(String[] args){
        int ans = count(30204);
        System.out.println(ans);
    }
    static int count(int n){
        return helper(n, 0);
    }
    static int helper(int n, int count){
        if(n == 0){
            return count;
        }
        int rem = n % 10;
        if(rem == 0){
            return helper(n/10, count+1);  // here we can't use count++
        }
        return helper(n/10, count);
    }
}