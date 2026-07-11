package lec_05.Interfaces;

public class Car implements Engine, Brake, Media {

    @Override
    public void brake() {
        System.out.println("Braking Car");
    }

    @Override
    public void start() {
        System.out.println("Starting Car");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Car");
    }

    @Override
    public void acc(){
        System.out.println("Acc Car");
    }

}
