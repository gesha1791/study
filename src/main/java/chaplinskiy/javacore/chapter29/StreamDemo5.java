package chaplinskiy.javacore.chapter29;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo5 {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();

        myList.add(new NamePhoneEmail("jora", "88776525", "jora@gmauk.ckn"));
        myList.add(new NamePhoneEmail("jora1", "88776525324", "jora1@gmauk.ckn"));
        myList.add(new NamePhoneEmail("jora2", "88776521245", "jora2@gmauk.ckn"));

        myList.stream().forEach((a) ->{
            System.out.println(a.name + " " + a.phonenum + " " + a.email);
        });

        System.out.println();

        Stream<NamePhone> namePhoneStream = myList.stream().map((a) -> new NamePhone(a.name, a.phonenum));

        namePhoneStream.forEach((a) -> {
            System.out.println(a.name + " " + a.phonenum);
        });

        Stream<NamePhone> filterNamePhone = myList.stream()
                .filter((a) -> a.name.equals("jora"))
                .map((a) -> new NamePhone(a.name, a.phonenum));


    }
}
