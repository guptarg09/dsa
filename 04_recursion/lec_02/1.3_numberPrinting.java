class printNumber{
    public static void main (String[] args){
        fun(5);
        System.out.println(); 
        funRev(5);
    }
    
    // printing while filling the stack
    static void fun(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        fun(n-1);
    }
    
    // printing while emptying the stack
     static void funRev(int n){
        if(n == 0){
            return;
        }
        fun(n-1);
        System.out.print(n + " ");
    }
}