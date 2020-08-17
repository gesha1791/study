package chaplinskiy.javacore.chapter22;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class UCDemo {
    public static void main(String[] args) throws IOException {
        int c;
        URL hp = new URL("http://google.com");
        URLConnection hpCOn = hp.openConnection();

        // получить дату
        long date = hpCOn.getDate();
        if (date == 0){
            System.out.println("Сведения о дате отсутствуют");
        } else {
            System.out.println("Дата: " + date);
        }

        //System.out.println("Тип содержимого: " + hp.getContentType());
        System.out.println("Тип содержимого: " + hp.getContent());

        // получить дату срока действия ресурса
        date = hpCOn.getExpiration();
        if (date == 0){
            System.out.println("Сведения о сроке действия отсутствуют");
        } else {
            System.out.println("Дата действия истекает: " + new Date(date));
        }

        // получить дату последней модификации
        date = hpCOn.getLastModified();
        if (date == 0){
            System.out.println("Сведения о дате последней модификации отсутствуют");
        } else {
            System.out.println("Дата последней модифкации: " + new Date(date));
        }

        // получить длину содержимого
        long len = hpCOn.getContentLengthLong();
        if (len == -1){
            System.out.println("Длина содержимого недоступна");
        } else {
            System.out.println("Длина содержимого: " + len);
        }

        if(len != 0){
            System.out.println("Содержимое");
            InputStream inputStream = hpCOn.getInputStream();
            while ((c = inputStream.read()) != -1){
                System.out.print((char) c);
            }
            inputStream.close();
        } else {
            System.out.println("Содержимое недоступно");
        }


    }
}
