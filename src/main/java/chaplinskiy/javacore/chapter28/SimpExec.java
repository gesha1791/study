package chaplinskiy.javacore.chapter28;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpExec {
    public static void main(String[] args) {
        CountDownLatch cd1 = new CountDownLatch(5);
        CountDownLatch cd2 = new CountDownLatch(5);
        CountDownLatch cd3 = new CountDownLatch(5);
        CountDownLatch cd4 = new CountDownLatch(5);

        ExecutorService es = Executors.newFixedThreadPool(2);

        System.out.println("Запуск потоков");

        // запустить потоки исполнения
        es.execute(new MyThreadV5(cd1, "A"));
        es.execute(new MyThreadV5(cd2, "B"));
        es.execute(new MyThreadV5(cd3, "C"));
        es.execute(new MyThreadV5(cd4, "D"));

        try {
            cd1.await();
            cd2.await();
            cd3.await();
            cd4.await();
        } catch (InterruptedException e){
            System.out.println(e);
        }

        es.shutdown();
        System.out.println("Завершение потоков");
    }
}
