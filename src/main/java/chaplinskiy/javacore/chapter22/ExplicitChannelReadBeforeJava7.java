package chaplinskiy.javacore.chapter22;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ExplicitChannelReadBeforeJava7 {
    public static void main(String[] args) {
        FileInputStream fIn = null;
        FileChannel fChan = null;
        ByteBuffer mBuf;
        int count;

        try {
            // сначала открываем файл
            fIn = new FileInputStream("test.txt");

            // получаем канал к этому файлу
            fChan = fIn.getChannel();

            // выделяем буфер
            mBuf = ByteBuffer.allocate(12);

            do{
                count = fChan.read(mBuf);

                if (count != -1){
                    mBuf.rewind();

                    for (int i = 0; i < count; i++) {
                        System.out.print((char) mBuf.get());
                    }
                }
            } while (count != -1);

            System.out.println();
        } catch (IOException e){
            System.out.println("Ошибка ввода-вывода");
        } finally {
            try {
                if(fChan != null) fChan.close();
            } catch (IOException e){
                System.out.println("Ошибка закрытия канала");
            }

            try{
                if(fIn != null) fIn.close();
            } catch (IOException e){
                System.out.println("Ошибка закрытия файла");
            }
        }
    }
}
