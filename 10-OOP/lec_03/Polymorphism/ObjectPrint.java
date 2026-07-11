package lec_03.Polymorphism;

// this is seperate program of printing the object
public class ObjectPrint {
    int num;

    public ObjectPrint(int num){
        this.num = num;
    }
// if you don't override the toString method then it invoke toString from object class (println -> valueOf -> toString())
    @Override
    public  String toString() {
        return "ObjectPrint " + num;
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(6);
//        System.out.println(obj.num);
        System.out.println(obj);
    }
}
