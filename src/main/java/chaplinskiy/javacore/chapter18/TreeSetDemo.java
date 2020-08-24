package chaplinskiy.javacore.chapter18;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> strings = new TreeSet<>();

        strings.add("C");
        strings.add("A");
        strings.add("B");
        strings.add("D");
        strings.add("E");
        strings.add("F");

        System.out.println(strings);

        System.out.println(strings.subSet("B", "F"));
    }
}
