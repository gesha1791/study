package chaplinskiy.javacore.chapter18;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class AlgorithmsDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(-8);
        ll.add(20);
        ll.add(-20);
        ll.add(8);

        // создать компаратор с обратным упорядочиванием
        Comparator<Object> r = Collections.reverseOrder();

        // отсортироват список
        Collections.sort(ll, r);

        System.out.println("Список отсортирован");

        for(int i : ll){
            System.out.print(i + " ");
        }

        System.out.println();

        //перетасовать список
        Collections.shuffle(ll);

        System.out.println("Список перетасован: ");

        for(int i : ll ){
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("min: " + Collections.min(ll));
        System.out.println("max: " + Collections.max(ll));
    }
}
