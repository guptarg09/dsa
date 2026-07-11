package lec_06.Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human ritesh = new Human(20, "Rietsh Gupta");
//        Human rahul = new Human(ritesh);

//        clone will copy all the value from one object to another object and it is faster way to copy
        Human rahul =  (Human) ritesh.clone();

        System.out.println(rahul.name);
        System.out.println(rahul.age);
        System.out.println(Arrays.toString(rahul.arr));

        rahul.age = 200;
        rahul.arr[0] = 100;
        System.out.println(Arrays.toString(rahul.arr));  //change reflect on both object during shallow
        System.out.println(Arrays.toString(ritesh.arr));
        System.out.println(rahul.age);  //change not reflect on both object during shallow
        System.out.println(ritesh.age);
    }
}
