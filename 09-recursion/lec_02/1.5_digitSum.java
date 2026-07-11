class DS{
    public static void main(String[] args){
        System.out.println(digitSum(2236));
    }
    static int digitSum(int num){
        if(num == 0){
            return 0;
        }
        return (n % 10) + digitSum(n/10);
    }
}