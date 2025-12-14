class This {
    int age;
    String name;
    int salary;
    boolean isMarried; 
    
    public static void main(String[] args){
        This obj = new This(25, "Ram", 100000, true);
        
        System.out.println(obj.name);
        System.out.println(obj.isMarried);
    }
    
    static void message(){
    
        // System.out.println(this.age)   // ERROR --> can't use here
        System.out.println("inside the static message");
    }

    static void message2(This obj){
        System.out.println("inside the static message2");
        System.out.println("Age = " + obj.age);  
    }

    public This(int age, String name, int salary, boolean isMarried){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.isMarried = isMarried;
        
        message();        // alling static method directly
        This.message();   // recommended since it shows it's a static method
        
        message2(this);   // passing current object to access instance data
    }
}
