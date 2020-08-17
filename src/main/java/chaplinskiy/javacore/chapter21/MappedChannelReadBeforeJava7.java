package chaplinskiy.javacore.chapter21;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class MappedChannelReadBeforeJava7 {
    public static void main(String[] args) {
        FileInputStream fin = null;
        FileChannel fChan = null;
        long fSize;
        MappedByteBuffer mBuf;

        try {

            // открываем файл
            fin = new FileInputStream("test.txt");

            // получаем канал доступа
            fChan = fin.getChannel();

            // получаем размер файла
            fSize = fChan.size();

            // а тепер сопостави файл с буфером
            mBuf = fChan.map(FileChannel.MapMode.READ_ONLY, 0, fSize);

            for (int i = 0; i < fSize; i++) {
                System.out.print((char) mBuf.get());
            }


        } catch (IOException e){
            System.out.println("Ошибка ввода-вывода");
        } finally {
            try {
                if(fChan != null) fChan.close();
            } catch (IOException e){
                System.out.println("Ошибка закрытия канала");
            }

            try{
                if(fin != null) fin.close();
            } catch (IOException e){
                System.out.println("Ошибка закрытия файла");
            }
        }
    }

}
