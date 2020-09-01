package chaplinskiy.javacore.chapter11;

public class Deadlock implements Runnable {
    A a = new A();
    B b = new B();

    Deadlock(){
        Thread.currentThread().setName("Главный поток");
        Thread t = new Thread(this, "Соперничающий поток");
        t.start();

        a.foo(b); // получить блокировку объекта в этом потоке исполнения
        System.out.println("Назад в главный поток");

    }

    @Override
    public void run() {
        b.bar(a); // получить блокировку для объекта b в другом потоке исполнения

        System.out.println("Назад в другой поток");
    }

    public static void main(String[] args) {
        new Deadlock();
    }
}
