package chaplinskiy.javacore.chapter28;

public class Consumer implements Runnable {
    Q q;

    Consumer(Q q){
        this.q = q;
        new Thread(this, "Consumer").start();
    }
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            q.get();
        }
    }
}
