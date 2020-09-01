package chaplinskiy.javacore.chapter18;

import java.io.*;
import java.util.Properties;

public class Phonebook {
    public static void main(String[] args) throws IOException {
        Properties ht = new Properties();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name, number;
        FileInputStream fIn = null;
        boolean changed = false;

        try {
            fIn = new FileInputStream("phonebook.dat");
        } catch (FileNotFoundException e) {
        }

        try {
            if(fIn != null){
                ht.load(fIn);
                fIn.close();
            }
        } catch (IOException e){
            System.out.println("Ошибка чтения файла");
        }

        do{
            System.out.println("Введите имя " + " 'выход' для завершения :") ;
            name = br.readLine();

            if(name.equals("выход")) continue;
            System.out.println("Введите номер: ");
            number = br.readLine();

            ht.put(name, number);
            changed = true;
        } while (!name.equals("выход"));

        if(changed){
            FileOutputStream fout = new FileOutputStream("phonebook.dat");

            ht.store(fout, "Телефонная книга");

            fout.close();
        }

        do {
            System.out.println("Введите имя " + " 'выход' для завершения :") ;

            name = br.readLine();
            if(name.equals("выход")) continue;

            number = (String)ht.get(name);

            System.out.println(number);
        } while (!name.equals("выход"));
    }
}
