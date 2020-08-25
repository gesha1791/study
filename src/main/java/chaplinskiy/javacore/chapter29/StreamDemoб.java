package chaplinskiy.javacore.chapter29;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class StreamDemoб {

    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>();

        myList.add(1.1);
        myList.add(3.4);
        myList.add(9.2);
        myList.add(4.7);
        myList.add(12.1);
        myList.add(5.0);

        myList.stream().forEach((a) -> {
            System.out.print(a + " ");
        });
        System.out.println();

        IntStream intStream = myList.stream().mapToInt((a) -> (int) Math.ceil(a));

        intStream.forEach((a) -> {
            System.out.print(a + " ");
        });
    }
}
