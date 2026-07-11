package lec_05.NestedInterface;

public class A {

    public interface nestedInterface {
        boolean isOdd(int num);
    }
}

class B implements A.nestedInterface {
    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}
