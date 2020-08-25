package chaplinskiy.javacore.chapter18;

import java.util.Comparator;

public class MyComp implements Comparator<String> {

    @Override
    public int compare(String a, String b) {
        /*String aStr, bStr;

        aStr = a;
        bStr = b;

        return bStr.compareTo(aStr);*/

        return a.compareTo(b);
    }
}
