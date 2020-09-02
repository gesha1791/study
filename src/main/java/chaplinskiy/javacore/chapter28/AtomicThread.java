package chaplinskiy.javacore.chapter28;

public class AtomicThread implements Runnable {
    String name;

    public AtomicThread(String n) {
        name = n;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("Запуск потока " + name);

        for (int i = 1; i <= 3; i++) {
            System.out.println("Поток " + name + " получено: " + SharedV2.ai.getAndSet(i));
            
        }
    }
}
