package chaplinskiy.javacore.chapter28;

import java.util.concurrent.ForkJoinPool;

public class FJExperiment {
    public static void main(String[] args) {
        int pLevel = 1;
        int threshold = 100;


        long beginT, endT;

        ForkJoinPool fjp = new ForkJoinPool(pLevel);

        double[] nums = new double[1_000_000];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (double) i;
        }

        Transform transform = new Transform(nums, 0, nums.length, threshold);

        beginT = System.nanoTime();

        fjp.invoke(transform);

        endT = System.nanoTime();

        System.out.println("Уровень параллелилизма: " + pLevel);

        System.out.println("Порого обработки: " + threshold);

        System.out.println("Истекшее время: " + (endT - beginT) + " нс");


    }
}
