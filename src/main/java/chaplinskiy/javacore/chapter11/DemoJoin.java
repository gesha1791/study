package chaplinskiy.javacore.chapter11;

public class DemoJoin {
    public static void main(String[] args) {
        NewThreadMulti ob1 = new NewThreadMulti("Один");
        NewThreadMulti ob2 = new NewThreadMulti("Два");
        NewThreadMulti ob3 = new NewThreadMulti("Три");

        System.out.println("Поток Один запущен: " + ob1.t.isAlive());
        System.out.println("Поток Два запущен: " + ob2.t.isAlive());
        System.out.println("Поток Три запущен: " + ob3.t.isAlive());

        // ожидать завершения потоков исполнения

        try {
            System.out.println("Ожидать завершения потоков");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e){
            System.out.println("Главный потко прерван");
        }

        System.out.println("Поток Один запущен: " + ob1.t.isAlive());
        System.out.println("Поток Два запущен: " + ob2.t.isAlive());
        System.out.println("Поток Три запущен: " + ob3.t.isAlive());

        System.out.println("Главный поток завершен");
    }
}
