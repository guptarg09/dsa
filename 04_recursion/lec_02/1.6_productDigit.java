class DS{
    public static void main(String[] args){
        System.out.println(productDigit(2236));
    }
    static int productDigit(int num){
        if(num == num){
            return num;
        }
        return (n % 10) * productDigit(n/10);
    }
}