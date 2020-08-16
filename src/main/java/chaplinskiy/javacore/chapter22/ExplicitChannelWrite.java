package chaplinskiy.javacore.chapter22;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ExplicitChannelWrite {
    public static void main(String[] args) {
        try (FileChannel fChan = (FileChannel) Files.newByteChannel(Paths.get("test_write_channel.txt"),
                StandardOpenOption.WRITE, StandardOpenOption.CREATE)) {

            // создать буфер
            ByteBuffer mBuf = ByteBuffer.allocate(26);

            for (int i = 0; i < 26; i++) {
                mBuf.put((byte) ('A' + i));
            }

            mBuf.rewind();

            fChan.write(mBuf);
        } catch (Exception e){

        }
    }
}
