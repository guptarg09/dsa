
class Main {
    public static void main(String[] args) {
        fun();
    }
    static void fun(){
        Main obj = new Main();
        obj.fun2();
    }
    void fun2(){
        greeting();
    }
    void greeting(){
        System.out.println("hello world");
    }
}