package chaplinskiy.javacore.chapter18;

import java.util.ArrayList;

public class ForEachDemo {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();

        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);

        for(int i : integers){
            System.out.print(i + " ");
        }

        int sum = 0;

        for(int i : integers){
            sum += i;
        }

        System.out.println();

        System.out.println(sum);
    }
}
