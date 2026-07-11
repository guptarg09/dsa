//   class Test{
//         static String name;
        
//         public Test(String name){
//             this.name = name;
//         }
//   }       

class InnerClasses {
    
    // if you make nested class like below then you have to make the method ststic
    static class Test{
        static String name;
        
        public Test(String name){
            this.name = name;
        }
        
        @Override
        public String toString() {
            return "Name: " + name;
        }
    }
    public static void main(String[] args) {
        Test a = new Test("Kunal");
        Test b = new Test("Rahul");
        
        System.out.println(a);
        System.out.println(b);
    }
    
}






// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class InnerClasses {
    public static void main(String[] args) {
        Test a = new Test("Kunal");
        Test b = new Test("Rahul");
        
        System.out.println(a);
        System.out.println(b);
    }
}
  class Test{
        static String name;
        
        public Test(String name){
            Test.name = name;
        }
        
        @Override
        public String toString() {
            return "Name: " + name;
        }
    }








    // Online Java Compiler
// Use this editor to write, compile and run your Java code online

class InnerClasses {
    
    static class Test{
        static String name;
        
        public Test(String name){
            this.name = name;
        }
        
        @Override
        public String toString() {
            return "Name: " + name;
        }
    }
    public static void main(String[] args) {
        Test a = new Test("Kunal");
        Test b = new Test("Rahul");
        
        System.out.println(a);
        System.out.println(b);
    }
}