// we make main non-static?
class Demo {
    public void main(String[] args) {
        System.out.println("Non-static main");
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.main(args); // explicitly calling non-static version
    }
}