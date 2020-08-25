package chaplinskiy.javacore.chapter18;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HTDemo2 {
    public static void main(String[] args) {
        Hashtable<String, Double> balance = new Hashtable<>();
        Enumeration<String> names;

        String str;
        double bal;

        balance.put("Jhonny", 1233.2);
        balance.put("Tim", 1233.2);
        balance.put("Rot", 1233.2);
        balance.put("Due", 1233.2);

        Set<String> strings = balance.keySet();

        Iterator<String> iterator = strings.iterator();

        while (iterator.hasNext()){
            str = iterator.next();
            System.out.println(str + " : " + balance.get(str));
        }

        System.out.println();

        bal = balance.get("Tim");
        balance.put("Tim", bal + 1000);

        System.out.println(balance.get("Tim"));
    }
}
