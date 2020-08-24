package chaplinskiy.javacore.chapter29;

import java.util.ArrayList;
import java.util.Optional;

public class StreamDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();

        myList.add(7);
        myList.add(72);
        myList.add(37);
        myList.add(57);
        myList.add(2);
        myList.add(997);

        Optional<Integer> reduce = myList.stream().reduce((a, b) -> a * b);
        if (reduce.isPresent()){
            System.out.println(reduce.get());
        }

        Integer reduce1 = myList.stream().reduce(1, (a, b) -> a * b);
        System.out.println(reduce1);

        Integer reduce2 = myList.stream().reduce(1, (a, b) -> {
            if (b % 2 == 0) return a * b;
            else return a;
        });

        System.out.println(reduce2);
    }
}
