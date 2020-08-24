package chaplinskiy.javacore.chapter18;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        System.out.println("Начальный размер: " + strings.size());

        strings.add("C");
        strings.add("F");
        strings.add("E");
        strings.add("A");

        System.out.println("Размер массива после ввода элементов: " + strings.size());

        System.out.println(strings);

        strings.remove("C");
        strings.remove(2);

        System.out.println(strings.size());
        System.out.println(strings);

        // trimToSize() уменьшение массива до текущего
        // ensureCapacity(int емкость) увеличение массива для производительности лучшей
    }
}
