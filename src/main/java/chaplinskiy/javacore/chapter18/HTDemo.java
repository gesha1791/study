package chaplinskiy.javacore.chapter18;

import java.util.Enumeration;
import java.util.Hashtable;

public class HTDemo {
    public static void main(String[] args) {
        Hashtable<String, Double> balance = new Hashtable<>();
        Enumeration<String> names;

        String str;
        double bal;

        balance.put("Jhonny", 1233.2);
        balance.put("Tim", 1233.2);
        balance.put("Rot", 1233.2);
        balance.put("Due", 1233.2);

        names = balance.keys();

        while (names.hasMoreElements()){
            str = names.nextElement();
            System.out.println(str + " : " + balance.get(str));
        }

        System.out.println();

        bal = balance.get("Tim");
        balance.put("Tim", bal + 1000);

        System.out.println(balance.get("Tim"));


    }
}
