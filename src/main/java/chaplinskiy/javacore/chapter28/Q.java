package chaplinskiy.javacore.chapter28;

// Реализация поставщика и потребителя, использующая
// семафоры для управления синхронизацией

import java.util.concurrent.Semaphore;

public class Q {
    int n;

    // начать с недоступного семафора потребителя

    // 0 гарантирует что этот семфор сработает первым
    static Semaphore semCon = new Semaphore(0);
    static Semaphore semProd =new Semaphore(1);

    void get(){
        try {
            semCon.acquire();
        }catch (InterruptedException e){
            System.out.println(e);
        }

        System.out.println("Получено: " + n);
        semProd.release();
    }

    void put(int n){
        try{
            semProd.acquire();
        } catch (InterruptedException e){
            System.out.println(e);
        }

        this.n = n;

        System.out.println("Отправлено: " + n);
        semCon.release();
    }

}
