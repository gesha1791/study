package chaplinskiy.javacore.chapter28;


import java.util.concurrent.CountDownLatch;

public class MyThreadV5 implements Runnable {
    String name;
    CountDownLatch latch;
    public MyThreadV5(CountDownLatch c, String n) {
        latch = c;
        name = n;

        new Thread(this);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + ": " + i);
            latch.countDown();
        }

    }
}
