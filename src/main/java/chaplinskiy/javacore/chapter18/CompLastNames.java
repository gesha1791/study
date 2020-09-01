package chaplinskiy.javacore.chapter18;

import java.util.Comparator;

public class CompLastNames implements Comparator<String> {


    @Override
    public int compare(String o1, String o2) {
        int i, j;

        i = o1.lastIndexOf(" ");
        j = o2.lastIndexOf(" ");

        return o1.substring(i).compareToIgnoreCase(o2.substring(j));
    }
}
