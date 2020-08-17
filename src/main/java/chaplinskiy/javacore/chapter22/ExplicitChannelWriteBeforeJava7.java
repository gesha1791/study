package chaplinskiy.javacore.chapter22;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ExplicitChannelWriteBeforeJava7 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        FileChannel fchan = null;
        ByteBuffer mBuf;

        try {
            // открываем файл
            fos = new FileOutputStream("test.txt");

            // получить канал
            fchan = fos.getChannel();

            // создать буффер
            mBuf = ByteBuffer.allocate(28);

            // записать некоторое кол-во байтов в буффер
            for (int i = 0; i < 28; i++) {
                mBuf.put((byte) ('A' + i));
            }

            // подготовить буфер к записи данных
            mBuf.rewind();

            // записать данные в файл
            fchan.write(mBuf);

        } catch (IOException e){
            System.out.println("Ошибка ввода-вывода");
        } finally {
            try {
                if(fchan != null) fchan.close();
            } catch (IOException e){
                System.out.println("Ошибка закрытия канала");
            }

            try{
                if(fos != null) fos.close();
            } catch (IOException e){
                System.out.println("Ошибка закрытия файла");
            }
        }

    }
}
