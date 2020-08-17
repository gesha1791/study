package chaplinskiy.javacore.chapter21;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExplicitChannelRead {
    public static void main(String[] args) {
        int count;
        Path filepath = null;

        // сначала получить путь к файлу
        try {
            filepath = Paths.get("test.txt");
        } catch (InvalidPathException e){
            System.out.println("Path error: " + e);
            return;
        }

        // затем получить канал к этому файлу
        // в блоке оператора try с ресурсами
        try(SeekableByteChannel fChan = Files.newByteChannel(filepath)) {
            // выделить память под буфер
            ByteBuffer mBuf = ByteBuffer.allocate(2);

            do {
                // читать данные из файла в буфер
                count = fChan.read(mBuf);

                // пректратить чтение по достижении конца файла
                if(count != -1){
                    // подготовить буфер к чтению из него данных
                    mBuf.rewind();

                    // читать файлы из буфера и выводить их на экран как символы
                    for (int i = 0; i < count; i++) {
                        System.out.print((char)mBuf.get());
                    }
                }
            } while (count != -1);
        } catch (IOException e){
            System.out.println("Ошибка ввода-вывода: " + e);
        }

    }
}
