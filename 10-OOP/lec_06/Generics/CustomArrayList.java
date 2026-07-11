package lec_06.Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_CAPACITY = 10;
    int size = 0;   //  working as index value


    public CustomArrayList() {
        this.data = new int[DEFAULT_CAPACITY];
    }


    public void add(int num) {
        if (isFull()) {
             resize();
        }
        data[size++] = num;
    }


    public void resize() {
        int[] temp = new int[data.length * 2];

//        copy the current item into the new array
        for(int i = 0; i < size; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }


    private boolean isFull() {
        return size == data.length;
    }

//    removing item from list
    public int remove() {
        if(size == 0) {
            throw new IllegalStateException("Can't remove from empty ArrayList");
        }

        int removed = data[--size];
        data[size] = 0;
        return removed;
    }


//    getting item from list
    public int get(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return data[index];
    }


//    setting the value at specified index
    public void set(int index, int value) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }


    @Override
    public String toString() {
//        return "CustomArrayList : {" +         // you can also use it as kunal's technique
//                "data = " + Arrays.toString(data) +
//                ", size = " + size +
//                '}';
        return "CustomArrayList: " + Arrays.toString(Arrays.copyOfRange(data, 0, size));
    }


//    Optional: data = new int[DEFAULT_CAPACITY]; to reset memory
    public void clear() {
        size = 0;
    }



    public static void main(String[] args) {

//        CustomArrayList list = new CustomArrayList();
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        System.out.println(list);


        CustomArrayList list2 = new CustomArrayList();
        for(int i = 0; i < 14; i++) {
            list2.add(i);
        }
        System.out.println(list2);

        list2.remove();
        System.out.println(list2);
    }
}