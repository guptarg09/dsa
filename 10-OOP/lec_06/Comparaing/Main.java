package lec_06.Comparaing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student ritesh = new Student(12, 83.75f);
        Student kunal = new Student(14, 89.7f);
        Student virat = new Student(13, 89.75f);
        Student rohit = new Student(1, 82.00f);
        Student shivam = new Student(3, 76.35f);
        Student ashwani = new Student(2, 95.75f);

        Student[] list = {rohit ,ritesh, kunal, virat, shivam, ashwani};
        System.out.println(Arrays.toString(list));

        Arrays.sort(list);
        System.out.println(Arrays.toString(list));


//        if(ritesh.compareTo(kunal) < 0) {
//            System.out.println("ritesh is greater than kunal");
//        }
    }
}
