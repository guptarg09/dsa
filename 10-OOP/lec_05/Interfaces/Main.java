package lec_05.Interfaces;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
//        Engine car = new Car();   ***we can also it***



//        car.start();
//        car.stop();
//        car.acc();
//
//
//        Media car2 = new Car();
//        car2.start();  // o/p - "Starting Car" but we want "CDplayer is started"
//        car2.stop();   // o/p - "Starting Car" but we want "CDplayer is stopped"


        NiceCar niceCar = new NiceCar();

        niceCar.start();
        niceCar.startMusic();
        niceCar.upgradeEngine();
        niceCar.start();

    }
}
