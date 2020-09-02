package chaplinskiy.javacore.chapter28;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class MyThreadV2 implements Runnable {
    CyclicBarrier cbar;
    String name;

    public MyThreadV2(CyclicBarrier cb, String n) {
        cbar = cb;
        name = n;
        new Thread(this).start();
    }

    @Override
    public void run() {

        System.out.println(name);
        try {
            cbar.await();
        } catch (BrokenBarrierException e){
            System.out.println(e);
        } catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
