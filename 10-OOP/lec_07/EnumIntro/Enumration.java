package lec_07.EnumIntro;

public class Enumration {
    enum Week implements A {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

//    these are enum constant
//    these are public, static, and final
//    since it is final you can't create child enums
//    type is Week




        Week() {
            System.out.println("constructor called for : " + this);
//            Enum constructors run once for each constant when the enum class is loaded, not when you access it.
        }

//        this is not public or protected, only private or default
//        why?
//        because we don't want to create new object
//        this is not the enum concept

//        internally : public static final Week Monday = new Week();    //  when the constructor is being called

        @Override
        public void hello() {
            System.out.println("hello, how are you doing");
        }
    }



    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
//        System.out.println(week);
//        System.out.println(week == Week.Monday);
//        System.out.println(week == Week.Saturday);
//        System.out.println(Week.Monday == Week.Sunday);
//        System.out.println(week.name());
//        System.out.println(week.ordinal());
        System.out.println(Week.valueOf("Monday"));


//        calling abstract hello() method
        week.hello();

        System.out.println("--------------------------");


//        for(Week day : Week .values())
//        {
//            System.out.println(day);
//        }
    }

}
