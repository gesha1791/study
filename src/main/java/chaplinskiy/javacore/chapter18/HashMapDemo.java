package chaplinskiy.javacore.chapter18;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Double> hm = new HashMap<>();

        hm.put("John Dou", 1234.3);
        hm.put("John Dou2", 1234.3);
        hm.put("John Dou3", 1234.3);
        hm.put("John Dou4", 1234.3);

        // получить множество записей
        Set<Map.Entry<String, Double>> set = hm.entrySet();

        // вывести множество записей
        for(Map.Entry<String, Double> me : set){
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        System.out.println();

        Double johnDouBalance = hm.get("John Dou");

        hm.put("John Dou", johnDouBalance + 1000);

        System.out.println("Новый остаток на счету: " + hm.get("John Dou"));
    }
}
