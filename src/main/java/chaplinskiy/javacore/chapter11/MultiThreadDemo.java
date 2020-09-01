package chaplinskiy.javacore.chapter11;

public class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThreadMulti("Один");
        new NewThreadMulti("Два");
        new NewThreadMulti("Три");

        try {
            // ожидать завершения других потоков
            Thread.sleep(10000);
        } catch (InterruptedException e){
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завершен");
    }
}
