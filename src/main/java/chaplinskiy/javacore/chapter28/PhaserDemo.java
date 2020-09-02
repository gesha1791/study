package chaplinskiy.javacore.chapter28;

import java.util.concurrent.Phaser;

public class PhaserDemo {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);
        int curPhase;

        System.out.println("Запуск потоков");

        new MyThreadV3(phaser, "A");
        new MyThreadV3(phaser, "B");
        new MyThreadV3(phaser, "C");

        // ожидать завершения всеми потоками исполнения первой фазы
        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Фаза " + curPhase + " завершена");

        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Фаза " + curPhase + " завершена");

        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Фаза " + curPhase + " завершена");

        // снять основной поток с регистрации
        phaser.arriveAndDeregister();

        if(phaser.isTerminated()) System.out.println("Синхронизатор фаз завершен");

    }
}
