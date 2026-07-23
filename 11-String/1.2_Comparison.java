public class Comparison {
    
    public static void main(String[] args) {
        String a = "Ritesh";
        String b = "Ritesh";
        String c = a;
//        System.out.println(c == a);
//        System.out.println(a == b);

        String name1 = new String("Ritesh");
        String name2 = new String("Ritesh");

        System.out.println(name1 == name2);

        System.out.println(name1.equals(name2));

    }
}