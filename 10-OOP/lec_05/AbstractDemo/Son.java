package lec_05.AbstractDemo;

 class Son extends Parent {

     public Son(int age) {
         this.age = age;
     }

    @Override
    void carrer() {
        System.out.println("I am going to be a programmer");
    }

    @Override
    void partner() {
        System.out.println("I love Papper Potts");
    }
}
