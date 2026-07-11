package lec_03.Polymorphism;

// seperate program of overloading
public class Numbers {
    double sum(double a, int b){   // here int -> double
        return a+b;
    }

    double sum(int a, int b){    // both are in the int and java prefer most specific match
        return a*b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main() {
        Numbers obj = new Numbers();
        System.out.println(obj.sum(2, 3));
        obj.sum(3, 4, 5);
    }
}
