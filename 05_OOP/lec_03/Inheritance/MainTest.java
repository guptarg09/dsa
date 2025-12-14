package lec_03.Inheritance;

public class MainTest {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(4);
        Box box3 = new Box(5.0, 3.3, 2.3);
        Box box4 = new Box(box2);
        BoxWeight box5 = new BoxWeight();




//        System.out.println(box1.l + ", " + box1.w + ", " + box1.h);
//        System.out.println(box2.l + ", " + box2.w + ", " + box2.h);
//        System.out.println(box3.l + ", " + box3.w + ", " + box3.h);
//        System.out.println(box4.l + ", " + box4.w + ", " + box4.h);
//        System.out.println(box5.h + ", " + box5.weight);



          Box box6 = new BoxWeight(4, 5, 6, 7);
//          System.out.println(box6.h);  //  we can access only all variables of Box class not BoxWeight class
//        System.out.println(box6.weight);  // ERROR


//        there are many variables in both parent and child class
//        but you have access to variables that are in ref type i.e. BoxWeight
//        hence you should have access of weight variable
//        this also means that the once you are trying  to access should be initialized
//        but here, when the object is of type parent class, how will you have will you call the constructor of child class
//        that is why ERROR

//        BoxWeight box7 = new Box(2, 3, 4);   // ERROR
//        System.out.println(box7.weight);




//        --------muitilevel inheritance----------

        BoxPrice box8 = new BoxPrice(5, 8, 200);
        System.out.println(box8.weight);

    }
}
