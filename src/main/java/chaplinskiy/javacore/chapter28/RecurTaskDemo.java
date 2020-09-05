package chaplinskiy.javacore.chapter28;

import java.util.concurrent.ForkJoinPool;

public class RecurTaskDemo {
    public static void main(String[] args) {
        ForkJoinPool fjp = new ForkJoinPool();

        double[] nums = new double[5000];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (double) (((i%2) == 0) ? i : -i);
        }

        SumFJ sumFJ = new SumFJ(nums, 0, nums.length);

        //Double sumResult = fjp.invoke(sumFJ);

        fjp.execute(sumFJ);

        while (!sumFJ.isDone()){
            System.out.println(fjp);
        }
    }
}
