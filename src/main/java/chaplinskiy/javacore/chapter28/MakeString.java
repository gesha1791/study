package chaplinskiy.javacore.chapter28;

import java.util.concurrent.Exchanger;


// поток формирующий символьную строку
public class MakeString implements Runnable {
    Exchanger<String> ex;
    String str;
    public MakeString(Exchanger<String> c) {
        ex = c;
        str = new String();
        new Thread(this).start();
    }

    @Override
    public void run() {
        char ch = 'A';
        for (int i = 0; i < 3; i++) {
            // заполнить буфер
            for (int j = 0; j < 5; j++) {
                str += (char) ch++;
            }
            try {
                // обменять заполненный буфер на пустой
                str = ex.exchange(str);
            } catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
