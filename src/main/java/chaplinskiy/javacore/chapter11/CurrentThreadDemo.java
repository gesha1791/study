package chaplinskiy.javacore.chapter11;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        System.out.println("Текущий поток исполнения: " + t);

        t.setName("My thread");

        System.out.println("После изменения имя потока: " + t);

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Главный поток исполнения прерван");
        }
    }
}
