package lec_05.AbstractDemo;

 class Daughter extends Parent{

     public Daughter(int age) {
         this.age = age;
     }

    @Override
    void carrer() {
        System.out.println("I am going to be a officer");
    }

    @Override
    void partner() {
        System.out.println("I love Iron Man");
    }
}
