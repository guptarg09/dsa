package lec_04.AccessModifier;

// defined for protect variable
public class SubClass extends A{
    public SubClass(int num, String name){
        super(num, name);
    }
    public static void main(String[] args) {
        SubClass obj = new SubClass(10, "Ritesh");
        int n = obj.num;
    }
}

// we can access the protected modifier in any package by creating the object of subclass, can't access with object of super class