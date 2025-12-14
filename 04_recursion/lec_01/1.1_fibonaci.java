class fibo{
    public static void main(String[] args){
        System.out.println(fiboNumber(6));
    }
    static int fiboNumber(int num){
        if(num < 2){
            return num;
        }
        return fiboNumber(num - 1) + fiboNumber(num - 2);
    }
}