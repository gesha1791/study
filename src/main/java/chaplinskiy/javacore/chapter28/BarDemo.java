package chaplinskiy.javacore.chapter28;

import java.util.concurrent.CyclicBarrier;

public class BarDemo {
    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(3, new BarAction());

        System.out.println("Запуск потоков");

        new MyThreadV2(cb, "A");
        new MyThreadV2(cb, "B");
        new MyThreadV2(cb, "C");
        new MyThreadV2(cb, "D");
        new MyThreadV2(cb, "E");
        new MyThreadV2(cb, "F");
        new MyThreadV2(cb, "G");
        new MyThreadV2(cb, "H");
        new MyThreadV2(cb, "I");
    }
}
