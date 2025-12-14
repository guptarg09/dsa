package lec_07;

//********Enum with Fields and Methods*********
enum Day {
    Monday("Weekday"),
    Tuesday("Weekday"),
    Saturday("Weekend"),
    Sunday("Weekend");

    private String type;

    // Constructor
    Day(String type) {
        this.type = type;
    }

    // Method
    public String getType() {
        return type;
    }
}

  class EnumTest {
    public static void main(String[] args) {
        for (Day d : Day.values()) {
            System.out.println(d + " is a " + d.getType());
        }
    }
}

