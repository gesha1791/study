package chaplinskiy.javacore.chapter28;

import java.util.concurrent.Phaser;

public class MyThreadV4 implements Runnable {
    Phaser pshr;
    String name;

    public MyThreadV4(MyPhaser p, String n) {
        pshr = p;
        name = n;
        pshr.register();
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (!pshr.isTerminated()){
            System.out.println("Поток " + name + " начинает фазу " + pshr.getPhase());
            pshr.arriveAndAwaitAdvance();
        }

    }
}
