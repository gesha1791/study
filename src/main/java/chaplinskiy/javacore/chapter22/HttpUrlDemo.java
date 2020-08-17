package chaplinskiy.javacore.chapter22;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HttpUrlDemo {
    public static void main(String[] args) throws IOException {
        URL hp = new URL("http://www.google.com");

        HttpURLConnection hpCon = (HttpURLConnection) hp.openConnection();

        System.out.println("Метод запроса: " + hpCon.getRequestMethod());
        System.out.println("Код ответа: " + hpCon.getResponseCode());
        System.out.println("Ответное сообщение: " + hpCon.getResponseMessage());

        Map<String, List<String>> headerFields = hpCon.getHeaderFields();
        Set<String> fields = headerFields.keySet();

        for(String k : fields){
            System.out.println("Ключ: " + k + " Значение: " + headerFields.get(k));
        }
    }
}
