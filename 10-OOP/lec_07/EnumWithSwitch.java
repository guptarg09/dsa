package lec_07;


// Enum with switch stmt
public class EnumWithSwitch {
    enum Color {
        RED,
        GREEN,
        BLUE,
        YELLOW;
    }

    public static void main(String[] args){

        Color var_1 = Color.YELLOW;

        // Switch case with Enum
        switch (var_1) {
            case RED:
                System.out.println("Red color");
                break;
            case GREEN:
                System.out.println("Green color");
                break;
            case BLUE:
                System.out.println("Blue color");
                break;
            default:
                System.out.println("Other color");
        }
    }
}
