package chaplinskiy.javacore.chapter21;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class MappedChannelWrite_v2 {
    public static void main(String[] args) {
        try(FileChannel fChan = (FileChannel) Files.newByteChannel((Paths.get("test_write_v2.txt")),
                StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.READ)) {
            MappedByteBuffer mBuf = fChan.map(FileChannel.MapMode.READ_WRITE, 0, 26);
            // нет явного вызова метода write, все что попадает в буфер сразу пишется в файл
            for (int i = 0; i < 26; i++) {
                mBuf.put((byte) ('A' + i));
            }
        } catch (IOException e){

        }
    }
}
