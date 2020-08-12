package chaplinskiy.javacore.chapter20;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemoTryWithResources {
    public static void main(String[] args) {
        String source = "Hello world!! Java is a very hard language!!";

        byte[] buf = source.getBytes();

        try(FileOutputStream f1 = new FileOutputStream("file1_1.txt");
            FileOutputStream f2 = new FileOutputStream("file2_2.txt");
            FileOutputStream f3 = new FileOutputStream("file3_3.txt")){
            for (int i = 0; i < buf.length; i += 2) {
                f1.write(buf[i]);
            }

            f2.write(buf);

            f3.write(buf, buf.length-buf.length/4, buf.length/4);
        } catch (IOException e) {
            System.out.println(e);;
        }
    }
}
