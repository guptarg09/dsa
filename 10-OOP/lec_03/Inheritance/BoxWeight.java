package lec_03.Inheritance;

public class BoxWeight extends Box {
    double weight;
    public BoxWeight() {
        this.weight = -1;
    }

    BoxWeight(BoxWeight other) {
        super(other);  // calls Box(Box old) to copy l, h, w
        weight = other.weight;  // copy weight
    }

    BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }


    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // call the parent class constructor that has 3 arguments...Since there's no h defined in BoxWeight, both this.h and super.h point to the same variable in Box.
        this.weight = weight;
//        super(l, h, w);  ERROR --> Because in Java, the call to super(...) must be the first statement in a constructor. You cannot put anything — not even this.weight = weight; — before it.

//        System.out.println(this.weight);
//        System.out.println(this.l);
//        System.out.println(super.h);  // we can use super keyword insted of this keyword in constructor
//        reason of using super --> if the Box class also contains the weight variable then super is used to access the weight of current(BoxWeight class) and this keyword is used for parent's weight
    }
}
