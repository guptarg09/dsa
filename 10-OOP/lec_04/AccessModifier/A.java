package lec_04.AccessModifier;

public class A {
    protected int num;
    String name;
    int[] arr;

    public void setNum(int num){
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
    }
}
