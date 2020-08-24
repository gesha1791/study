package chaplinskiy.javacore.chapter18;

import java.util.ArrayList;
import java.util.Spliterator;

public class SplitIteratorDemo {
    public static void main(String[] args) {
        ArrayList<Double> vals = new ArrayList<>();

        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);


        Spliterator<Double> spliterator = vals.spliterator();
        while (spliterator.tryAdvance((n) -> System.out.print(n + " ")));

        System.out.println();

        spliterator = vals.spliterator();
        ArrayList<Double> valsSqrt = new ArrayList<>();
        spliterator.forEachRemaining((n) -> valsSqrt.add(Math.sqrt(n)));
        System.out.println();
        Spliterator<Double> spliterator1 = valsSqrt.spliterator();
        spliterator1.forEachRemaining((n) -> System.out.print(n + " "));


    }
}
