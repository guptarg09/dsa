package lec_06.Generics;

import java.util.ArrayList;
import java.util.Arrays;


public class CustomGenricArrayList<T> {
    private Object[] data;
    private static int DEFAULT_CAPACITY = 10;
    int size = 0;   //  working as index value


    public CustomGenricArrayList() {
        this.data = new Object[DEFAULT_CAPACITY];
    }


    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }


    public void resize() {
        Object[] temp = new Object[data.length * 2];

//      copy the current item into the new array
        for(int i = 0; i < size; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }


    private boolean isFull() {
        return size == data.length;
    }


    //    removing item from list
    public T remove() {
        if(size == 0) {
            throw new IllegalStateException("Can't remove from empty ArrayList");
        }

        T removed = (T) data[--size];
        data[size] = null;
        return removed;
    }


    //    getting item from list
    public T get(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return (T) data[index];
    }


    //    setting the value at specified index
    public void set(int index, T value) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        data[index] = value;
    }


//    size methos
     public int size() {
        return size;
     }

//     capacity method
    public int capacity() {
        return data.length;
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

        CustomGenricArrayList<Integer> list = new CustomGenricArrayList<>();
        for(int i = 0; i < 14; i++) {
            list.add(i);
        }
        System.out.println(list);



        CustomGenricArrayList<Character> listStr = new CustomGenricArrayList<>();
        for(int i = 0; i < 14; i++) {
            listStr.add((char)('a' + i));
        }
        System.out.println(listStr);



        listStr.clear();
        System.out.println(listStr);

        list.set(2, 33);
        System.out.println(list);

        System.out.println(list.get(2));



        CustomGenricArrayList<String> listString = new CustomGenricArrayList<>();
        listString.add("abc");
        System.out.println(listString);

    }
}
