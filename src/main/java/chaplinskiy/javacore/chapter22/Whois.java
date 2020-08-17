package chaplinskiy.javacore.chapter22;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Whois {
    public static void main(String[] args) throws IOException {
        int c;

        // создать сокетное соединение с веб-сайтом internic.net
        // через порт 43
        Socket s = new Socket("whois.internic.net", 43);

        InputStream inputStream = s.getInputStream();
        OutputStream outputStream = s.getOutputStream();

        // сформировать строку запроса
        String str = (args.length == 0 ? "MHProfessional.com" : args[0])  + "\n";

        // преобразовать строку в байты
        byte[] buf = str.getBytes();

        // послать запрос
        outputStream.write(buf);

        // прочитать ответ и вывести его на экран
        while ((c = inputStream.read()) != -1){
            System.out.print((char) c);
        }

        s.close();
    }


    // JAVA 7
    // try (Socket s = new Socket("whois.internic.net", 43))
}
