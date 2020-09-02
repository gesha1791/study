package chaplinskiy.javacore.chapter28;

import java.util.concurrent.locks.ReentrantLock;

public class LockThread implements Runnable {

    String name;
    ReentrantLock lock;

    public LockThread(ReentrantLock l, String n) {
        lock = l;
        name = n;
        new Thread(this).start();
    }

    @Override
    public void run() {

        System.out.println("Запуск потока: " + name);

        try {
            // сначала заблокирповать счетчик
            System.out.println("Поток " + name + " ожидает блокировки счетчика");

            lock.lock();

            System.out.println("Поток " + name + " блокирует счетчик");

            Shared.count++;
            System.out.println("Поток " + name + ": " + Shared.count);
            // а теперь переключение контекста если это возможно

            System.out.println("Поток " + name + " ожидает");
            Thread.sleep(1000);
        } catch (InterruptedException e){
            System.out.println(e);
        } finally {
            // снять блокировку
            System.out.println("Поток " + name + " разблокирует счетчик");
            lock.unlock();
        }

    }
}
