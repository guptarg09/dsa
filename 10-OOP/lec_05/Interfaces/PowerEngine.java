package lec_05.Interfaces;

public class PowerEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Power engine is started");
    }

    @Override
    public void stop() {
        System.out.println("Power engine is stopped");
    }

    @Override
    public void acc() {
        System.out.println("Power engine is acc");
    }
}
