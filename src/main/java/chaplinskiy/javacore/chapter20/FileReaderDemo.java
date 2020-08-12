package chaplinskiy.javacore.chapter20;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("/Users/teammember/IdeaProjects/study/text.txt")){
            int c;

            while ((c = fr.read()) != -1){
                System.out.print(c);
            }
        } catch (IOException e){
            System.out.println("Ошибка ввода вывода");
        }
    }
}
