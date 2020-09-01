package chaplinskiy.javacore.chapter29;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class StreamDemo9 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();

        myList.add("Альфа");
        myList.add("Бета");
        myList.add("Гамма");
        myList.add("Дельта");
        myList.add("Кси");
        myList.add("Омега");

        Stream<String> stream = myList.stream();

        Spliterator<String> spliterator = stream.spliterator();

        while(spliterator.tryAdvance((n) -> System.out.println(n)));
        System.out.println();

        spliterator.forEachRemaining((n) -> System.out.println(n));
    }
}
