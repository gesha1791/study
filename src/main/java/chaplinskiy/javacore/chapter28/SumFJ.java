package chaplinskiy.javacore.chapter28;

import java.util.concurrent.RecursiveTask;

public class SumFJ extends RecursiveTask<Double> {

    final int seqThreshold = 500;

    double [] data;

    int start, end;

    SumFJ(double[] vals, int s, int e){
        data = vals;
        start = s;
        end = e;
    }


    @Override
    protected Double compute() {
        double sum = 0;

        if ((end - start) < seqThreshold){
            for (int i = start; i < end; i++) {
                sum += data[i];
            }
        }
        else {
            int middle = (start + end) / 2;

            SumFJ subTaskA = new SumFJ(data, start, middle);
            SumFJ subTaskB = new SumFJ(data, middle, end);

            subTaskA.fork();
            subTaskB.fork();

            // ожидать завершения подзадач и накопить результаты
            sum = subTaskA.join() + subTaskB.join();
        }
        return sum;
    }
}
