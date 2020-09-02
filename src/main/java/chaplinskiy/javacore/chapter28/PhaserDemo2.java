package chaplinskiy.javacore.chapter28;

public class PhaserDemo2 {
    public static void main(String[] args) {
        MyPhaser phsr = new MyPhaser(1, 3);

        System.out.println("Запуск потоков\n");

        new MyThreadV4(phsr, "A");
        new MyThreadV4(phsr, "B");
        new MyThreadV4(phsr, "C");

        // ожидать завершения определенного количества фаз
        while (!phsr.isTerminated()){
            phsr.arriveAndAwaitAdvance();
        }

        System.out.println("Синхронизатор фаз завершен");
    }
}
