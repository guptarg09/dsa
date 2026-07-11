package lec_05.Interfaces;

public class ElectricEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Starting Electric Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Electric Engine");
    }

    @Override
    public void acc() {
        System.out.println("Accumulating Electric Engine");
    }


}
