class StaticBlock{
    static int a = 4;
    static int b;

    static{
        System.out.println("I am in static block");
        b = a * 5;
    }

    public static void main(String[] args){
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;  

        System.out.println(StaticBlock.a + " " + StaticBlock.b);
        
        
        // we created two objects but sout stmt inside the static block executed only once because static block executed
        //  only once when the calss is loaded into the memory
        StaticBlock abc = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }

}