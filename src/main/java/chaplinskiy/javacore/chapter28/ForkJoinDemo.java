package chaplinskiy.javacore.chapter28;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinDemo {
    public static void main(String[] args) {
        // создать пул задач
        ForkJoinPool fjp = new ForkJoinPool();

        // общий пул
        //ForkJoinPool fjp = ForkJoinPool.commonPool();

        double[] nums = new double[1000000];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (double) i;
        }

        System.out.println("Часть исходнйо последовательности");

        for (int i = 0; i < 10; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\n");

        SqrtTransform sqrtTransform = new SqrtTransform(nums, 0, nums.length);

        sqrtTransform.invoke();

        for (int i = 0; i < 10; i++) {
            System.out.format("%.4f ", nums[i]);
        }
        System.out.println();
    }
}
