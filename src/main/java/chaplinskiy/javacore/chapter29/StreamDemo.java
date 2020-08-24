package chaplinskiy.javacore.chapter29;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();

        myList.add(7);
        myList.add(72);
        myList.add(37);
        myList.add(57);
        myList.add(997);

        Stream<Integer> myStream = myList.stream();

        Optional<Integer> min = myStream.min(Integer::compare);

        if(min.isPresent()){
            System.out.println(min.get());
        }

        myStream = myList.stream();
        Optional<Integer> max = myStream.max(Integer::compare);

        if(max.isPresent()){
            System.out.println(max.get());
        }

        Stream<Integer> sorted = myList.stream().sorted();

        sorted.forEach((n) -> System.out.print(n + " "));

        System.out.println();

        Stream<Integer> integerStream = myList.stream().sorted()
                .filter((n) -> (n % 2) == 1);

        integerStream.forEach((n) -> System.out.print(n + " "));

        Stream<Integer> integerStream1 = myList.stream()
                .filter((n) -> (n % 2) == 1)
                .filter((n) -> n > 9);

        System.out.println();


        integerStream1.forEach((n) -> System.out.print(n + " "));


    }
}
