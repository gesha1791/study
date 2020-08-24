package chaplinskiy.javacore.chapter18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("C");
        strings.add("A");
        strings.add("E");
        strings.add("B");
        strings.add("D");
        strings.add("F");

        System.out.println(strings.size());
        Iterator<String> itr = strings.iterator();
        while (itr.hasNext()){
            String next = itr.next();
            System.out.print(next + " ");
        }

        System.out.println();

        // видоизменять перебираемые объекты

        ListIterator<String> litr = strings.listIterator();
        while (litr.hasNext()){
            String next = litr.next();
            litr.set(next + "+");
        }
        itr = strings.iterator();
        while (itr.hasNext()){
            String element = itr.next();
            System.out.print(element + " ");
        }

        System.out.println();

        while (litr.hasPrevious()){
            String element = litr.previous();
            System.out.print(element + " ");
        }

    }
}
