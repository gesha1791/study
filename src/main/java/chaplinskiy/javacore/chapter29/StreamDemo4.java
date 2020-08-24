package chaplinskiy.javacore.chapter29;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo4 {
    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>();

        myList.add(9.0);
        myList.add(4.0);
        myList.add(25.0);

        Stream<Double> doubleStream = myList.stream().map((a) -> Math.sqrt(a));

        Double reduce = doubleStream.reduce(1.0, (a, b) -> a * b);
        System.out.println(reduce);
    }
}
