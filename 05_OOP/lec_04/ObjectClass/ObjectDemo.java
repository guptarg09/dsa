package lec_04.ObjectClass;

// here we talk about every single method of the object class
public class ObjectDemo {

    int num;
    float gpa;

    public ObjectDemo(int num, float gpa){
        this.num = num;
        this.gpa = gpa;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
//        return num;
    }

    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public  String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static  void main(String[] args) {

        ObjectDemo obj = new ObjectDemo(10, 8.6f);
        ObjectDemo obj2 = new ObjectDemo(10, 8.7f);

//        System.out.println(obj.hashCode());
//        System.out.println(obj2.hashCode());

        if(obj == obj2) {  // it checks whether the both variable pointing to the same object or not
            System.out.println("obj == obj2");
        }

        if (obj.equals(obj2)) {
            System.out.println("obj.equals(obj2)");
        }


//        instanceof keyword
        System.out.println(obj instanceof ObjectDemo);
        System.out.println(obj instanceof Object);


//        getting the class name
        System.out.println(ObjectDemo.class);
        System.out.println(obj.getClass());
    }
}
