package chaplinskiy.javacore.chapter28;

import java.util.concurrent.Exchanger;

// использующий символьную строку
public class UseString implements Runnable {
    Exchanger<String> ex;
    String str;

    public UseString(Exchanger<String> c) {
        ex = c;
        new Thread(this).start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                // обменять пустой буфер на заполненный
                str = ex.exchange(new String());
                System.out.println("Получено " + str);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
