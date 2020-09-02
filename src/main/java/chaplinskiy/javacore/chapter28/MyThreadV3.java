package chaplinskiy.javacore.chapter28;

import java.util.concurrent.Phaser;

public class MyThreadV3 implements Runnable {
    Phaser phsr;
    String name;

    public MyThreadV3(Phaser p, String n) {
        phsr = p;
        name = n;
        phsr.register();
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("Поток " + name + " начинает первую фазу");
        phsr.arriveAndAwaitAdvance(); // Известить о достижении фазы

        // Небольшая пауза, что бы не нарушить порядок вывода.
        // Только для иллюстрации, но необязательно для правильного функционирования
        // регистартора фаз

        try {
            Thread.sleep(10);
        } catch (InterruptedException e){
            System.out.println(e);
        }

        System.out.println("Поток " + name + " начинает вторую фазу");
        phsr.arriveAndAwaitAdvance(); // Известить о достижении фазы

        // Небольшая пауза, что бы не нарушить порядок вывода.
        // Только для иллюстрации, но необязательно для правильного функционирования
        // регистартора фаз

        try {
            Thread.sleep(10);
        } catch (InterruptedException e){
            System.out.println(e);
        }

        System.out.println("Поток " + name + " начинает третью фазу");


        phsr.arriveAndDeregister(); // известить о достижении фазы и снять потоки с регистрации


    }
}
