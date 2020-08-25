package chaplinskiy.javacore.chapter29;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo7 {

    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();

        myList.add(new NamePhoneEmail("jora", "88776525", "jora@gmauk.ckn"));
        myList.add(new NamePhoneEmail("jora1", "88776525324", "jora1@gmauk.ckn"));
        myList.add(new NamePhoneEmail("jora2", "88776521245", "jora2@gmauk.ckn"));

        Stream<NamePhone> namePhoneStream = myList.stream().map((a) -> new NamePhone(a.name, a.phonenum));

        List<NamePhone> npList = namePhoneStream.collect(Collectors.toList());

        for(NamePhone n : npList){
            System.out.println(n.name + ": " + n.phonenum);
        }

        System.out.println();

        namePhoneStream = npList.stream().map((a) -> {
            return new NamePhone(a.name,a.phonenum);
        });



        Set<NamePhone> npSet = namePhoneStream.collect(Collectors.toSet());

        for(NamePhone n : npSet){
            System.out.println(n.name + ": " + n.phonenum);
        }


        namePhoneStream = npList.stream().map((a) -> {
            return new NamePhone(a.name,a.phonenum);
        });

        LinkedList<Object> collect = namePhoneStream.collect(
                () -> new LinkedList<>(),
                //(list, element) -> list.addFirst(element)
                (list, element) -> list.add(element),
                (listA, listB) -> listA.addAll(listB));

        namePhoneStream = npList.stream().map((a) -> {
            return new NamePhone(a.name,a.phonenum);
        });

        HashSet<NamePhone> setNp = namePhoneStream
                .collect(
                        HashSet::new,
                        HashSet::add,
                        HashSet::addAll
                );
    }
}
