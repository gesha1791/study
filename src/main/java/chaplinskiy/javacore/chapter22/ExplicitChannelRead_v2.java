package chaplinskiy.javacore.chapter22;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExplicitChannelRead_v2 {
    public static void main(String[] args) {
        int count;

        // Здесь канал открывается по пути, возвращаемому
        // методом Paths.get() в виде объекта типа Path.
        // Переменная filepath больше не нужна
        try(SeekableByteChannel fChan = Files.newByteChannel(Paths.get("test.txt"))) {
            // выделить память под буфер
            ByteBuffer mBuf = ByteBuffer.allocate(128);

            do {
                // читать данные из файла в буфер
                count = fChan.read(mBuf);

                // прекратить чтение по достижению конца файла
                if (count != -1){

                    mBuf.rewind();

                    for (int i = 0; i < count; i++) {
                        System.out.print((char) mBuf.get());
                    }
                }

            } while (count != -1);
            System.out.println();

        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути");
        } catch (IOException e){
            System.out.println("Ошибка ввода-вывода");
        }
    }
}
