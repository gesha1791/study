package chaplinskiy.javacore.chapter29;

import java.util.ArrayList;

public class StreamDemo3 {
    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>();

        myList.add(9.0);
        myList.add(4.0);
        myList.add(25.0);

        Double reduce = myList.parallelStream().reduce(
                1.0,
                (a, b) -> a * Math.sqrt(b),
                (a, b) -> a * b);

        System.out.println(reduce);

        // sequential
        // unordered
        // forEachOrdered
    }
}
