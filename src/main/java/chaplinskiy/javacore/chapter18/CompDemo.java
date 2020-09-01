package chaplinskiy.javacore.chapter18;

import java.util.TreeSet;

public class CompDemo {
    public static void main(String[] args) {
        //TreeSet<String> ts = new TreeSet<>(new MyComp());
        TreeSet<String> ts = new TreeSet<>(new MyComp().reversed());

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
