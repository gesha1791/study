package chaplinskiy.javacore.chapter18;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToArray {
    public static void main(String[] args) {
        // хранятся только ссылки на объекты
        ArrayList<Integer> integers = new ArrayList<>();

        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);

        System.out.println(integers.size());

        // создаем пустой массив нужного размера
        Integer[] in = new Integer[integers.size()];
        // заполняем массив
        in = integers.toArray(in);

        int sum = 0;

        // autoboxing
        for(int i : in){
            sum += i;
        }

        System.out.println(sum);
    }
}
