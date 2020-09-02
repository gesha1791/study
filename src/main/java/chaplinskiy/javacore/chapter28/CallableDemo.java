package chaplinskiy.javacore.chapter28;

import java.util.concurrent.*;

public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future<Integer> f;
        Future<Double> f2;
        Future<Integer> f3;

        System.out.println("Запуск");

        f = executorService.submit(new Sum(10));
        f2 = executorService.submit(new Hypot(3, 4));
        f3 = executorService.submit(new Factorial(5));

        try {
            System.out.println(f.get());
            System.out.println(f2.get());
            System.out.println(f3.get());
        } catch (InterruptedException e){
            System.out.println(e);
        } catch (ExecutionException e){
            System.out.println(e);
        }

        executorService.shutdown();

        System.out.println("Завершение");

    }
}
