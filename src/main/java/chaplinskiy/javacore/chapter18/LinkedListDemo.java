package chaplinskiy.javacore.chapter18;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();

        strings.add("F");
        strings.add("B");
        strings.add("D");
        strings.add("E");
        strings.add("C");
        strings.addLast("Z");
        strings.addFirst("A");
        strings.add(1, "A2");

        System.out.println("Исходное содержимое: " + strings);

        strings.remove("F");
        strings.remove(2);

        System.out.println("Содержимое после удаления объектов: " + strings);

        String s = strings.get(2);
        strings.set(2, s + " изменено");

        System.out.println(strings);


    }
}
