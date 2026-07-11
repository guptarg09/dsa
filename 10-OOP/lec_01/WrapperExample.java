package lec_01;

class WrapperExample{
    public static void main(String[] args){
        int n = 10;

        // here Integer is a class so it provide mutiple function for this wrapper class object
        Integer num = 45;

        int a = 10;
        int b = 20;
        System.out.println("beforea : " + a + " " + b);
        swap(a, b);
        System.out.println("after : " + a + " " + b);


        final A ritesh = new A("Ritesh Gupta");
        ritesh.name = "Rahul";

        // when a non primitive is final, you can't reassign it like below
        // ritesh = new A("new object");


        A obj;
        for(int i = 0; i < 100000; i++){
            obj = new A("Random Name");
        }
    }


    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}

class A{
    final int num = 10;
    String name;

    public A(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable{
        System.out.println("object is destroyed");
    }
}
