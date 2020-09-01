package chaplinskiy.javacore.chapter18;

import java.util.TreeSet;

public class CompDemo2 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>((aStr, bStr) -> bStr.compareTo(aStr));

        ts.add("C");
        ts.add("B");
        ts.add("A");
        ts.add("G");
        ts.add("Z");
        ts.add("Q");

        for (String element : ts){
            System.out.print(element);
        }
    }
}
