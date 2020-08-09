package chaplinskiy.javacore.chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SnowFileFinally {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;

        // сначала убедиться, что имя файла указано
        if (args.length !=1){
            System.out.println("Использование: SnowFileFinally: имя_файла");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);

            do {
                i = fin.read();
                if (i != -1) System.out.println((char) i);
            } while (i != -1);
        } catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        } catch (IOException e){
            System.out.println("Произошла ошибка ввода-вывода");
        } finally {
            try {
                if (fin != null) fin.close();
            } catch (IOException e){
                System.out.println("Ошибка закрытия файла");
            }
        }
    }
}
