package lec_06.Cloning;

public class Human implements Cloneable {
    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{2, 3, 6, 7, 8, 9};
    }

//    public Human(Human other) {
//        this.age = other.age;
//        this.name = other.name;
//    }

    @Override
    public Object clone() throws CloneNotSupportedException {

//        ***shallow copy***
//        return super.clone();


//        ***deep copy***

        Human clone = (Human) super.clone();  //  also shallow copy

//        making it deep copy
        clone.arr = new int[this.arr.length];
        for(int i = 0; i < clone.arr.length; i++) {
            clone.arr[i] = this.arr[i];
        }
    return clone;
    }
}
