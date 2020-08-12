package chaplinskiy.javacore.chapter20;

import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Vector;

public class SequenceInputStreamDemo {
    public static void main(String[] args) {
        int c;

        Vector<String> files = new Vector<>();

        files.addElement("file1.txt");
        files.addElement("file2.txt");
        files.addElement("file3.txt");

        try(InputStream in = new SequenceInputStream(new InputStreamEnumerator(files))){
            while ((c = in.read()) != -1){
                System.out.print((char)c);
            }
        }catch (IOException e){
            System.out.println("Ошибка ввода-вывода!");
        }
    }
}
