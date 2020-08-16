package chaplinskiy.javacore.chapter22;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MappedChannelRead {
    public static void main(String[] args) {
        try(FileChannel fChan = (FileChannel) Files.newByteChannel(Paths.get("test.txt"))) {
            long fSize = fChan.size();

            MappedByteBuffer mappedByteBuffer = fChan.map(FileChannel.MapMode.READ_ONLY, 0, fSize);

            for (int i = 0; i < fSize; i++) {
                System.out.print((char) mappedByteBuffer.get());
            }
            System.out.println();
        }catch (IOException e){

        }
    }
}
