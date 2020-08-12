package chaplinskiy.javacore.chapter20;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamDemo {
    public static void main(String[] args) {
        String tmp = "abcdefghijklmnopqrstuvwxyz";
        byte[] bytes = tmp.getBytes();
        ByteArrayInputStream input1 = new ByteArrayInputStream(bytes);
        ByteArrayInputStream input2 = new ByteArrayInputStream(bytes, 0, 3);
    }
}
