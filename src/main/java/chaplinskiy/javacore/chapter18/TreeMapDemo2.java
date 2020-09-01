package chaplinskiy.javacore.chapter18;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo2 {
    public static void main(String[] args) {
        TreeMap<String, Double> tm = new TreeMap<>(new TCopm());

        tm.put("Джон Доу", 1234.3);
        tm.put("Том Смит", 123.3);
        tm.put("Джейн Бейкер", 12243.3);
        tm.put("Тод Халл", 122413.3);
        tm.put("Ральф Смит", 413.3);

        Set<Map.Entry<String, Double>> set = tm.entrySet();

        for(Map.Entry<String, Double> me : set){
            System.out.println(me.getKey() + ": " + me.getValue());
        }

        System.out.println();
    }
}
