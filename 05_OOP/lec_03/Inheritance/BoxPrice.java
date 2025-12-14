package lec_03.Inheritance;

// the below class is extends BoxWeight and object class then you say java dos't sopport multiple inheritance
public class BoxPrice extends BoxWeight {

    double cost;

    BoxPrice() {
        super();  // super calls BoxWeight
        this.cost = -1;
    }

    BoxPrice(BoxPrice other) {
        super(other);
        this.cost = -1;
    }

    public  BoxPrice(double side, double weight, double cost){
        super(side, weight);
        this.cost = cost;

        System.out.println(side + " " + weight + " " + cost);
        System.out.println(cost);
//        System.out.println(super.cost);  ERROR --> cost not defined in immediate super class defined in current class.
//        System.out.println(super.side);  ERROR
        System.out.println(this.cost);
        System.out.println(super.weight);
    }

}
