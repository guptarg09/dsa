package lec_05.Interfaces;

public class CDplayer implements Media{

    @Override
    public void start() {
        System.out.println("CD player is started");
    }

    @Override
    public void stop() {
        System.out.println("CDplayer is stopped");
    }
}
