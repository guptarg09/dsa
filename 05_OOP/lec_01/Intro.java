package lec_01;

import java.util.Arrays;
class Intro {
    public static void main(String[] args) {

        // data of 5 students
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        // this is just refrence to object of type student
        // Student ritesh;    // just declare
        // ritesh = new Student();

        // Student[] students = new Student[5];
        // System.out.println(Arrays.toString(students));

        // -----------------------------


        // Student ritesh = new Student();
        // System.out.println(ritesh);
        // System.out.println(ritesh.rno);
        // System.out.println(ritesh.name);
        // System.out.println(ritesh.marks);

        // when new object is created it goes inside te the constructor
        Student ritesh = new Student();
        ritesh.greeting();
        ritesh.changeName("radha");


        Student rahul = new Student(15, "Rahul Gupta", 98);
        // System.out.println(rahul.rno);
        // System.out.println(rahul.name);
        // System.out.println(rahul.marks);


        ritesh.rno = 13;
        ritesh.name = "Ritesh Gupta";
        ritesh.marks = 88.5f;

        // System.out.println(ritesh);
        // System.out.println(ritesh.rno);
        // System.out.println(ritesh.name);
        // System.out.println(ritesh.marks);

        // if we hane 10000 properties in student class then above way is too complex so constructor is used


        Student random = new Student(ritesh);
        System.out.println(random.name);


        Student random2 = new Student();
        System.out.println(random2.name);

    }
}


// for every student type
class Student{
    int rno;
    String name;
    float marks = 90f;



     void greeting(){
         System.out.println("Hello! my name is "+ this.name);
     }

     void changeName(String newName){
         name = newName;
     }


    // we need a way to add/assign the values of above properties object by object(for each object)

    // we need one word to access any object like ritesh
    // Student(){
    //     // ritesh.rno = 13;
    //     // ritesh.name = "Ritesh Gupta";
    //     // ritesh.marks = 88.5f;


    //     // this keyword is nothing, but replacing this with refrence variable
    //     this.rno = 13;
    //     this.name = "Ritesh Gupta";
    //     this.marks = 88.5f;
    // }

    Student(){
        // this is how you can call a constructor from another constructor
        // internally it something like : new Student(13, "default person", 100.0f)
        this(13, "default person", 100);
    }

    Student(int rno, String name, int marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;


        // it is correct when you change arguments of function
        // rno = s_rno;
        // name = s_name;
        // marks = s_marks;
    }


    Student(Student other){
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

}