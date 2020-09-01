package chaplinskiy.javacore.chapter11;


public class NewThreadV2 extends Thread {

    NewThreadV2(){
        super("Демонстрационный поток");
        System.out.println("Дочерний поток: " + this);
        start();
    }

    public void run(){
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Дочерний поток: " + i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println("Дочерний поток прерван");
        }
        System.out.println("Дочерний поток завершен");
    }
}
