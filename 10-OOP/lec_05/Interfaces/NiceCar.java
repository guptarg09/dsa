package lec_05.Interfaces;

public class NiceCar {

    private Engine engine;
    private Media player = new CDplayer();

//    this method is used to choose a engine
    public NiceCar() {
//        engine = new Car();           //  object to take o/p as "starting car" when start() invoked
        engine = new PowerEngine();
    }
    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void startMusic() {
        player.start();
    }

    public void stopMusic() {
        player.stop();
    }

//    this method is used for upgrade the selected
    public void upgradeEngine() {
        this.engine = new ElectricEngine();
    }
}