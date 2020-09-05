package chaplinskiy.javacore.chapter28;

import java.util.concurrent.RecursiveAction;

// Класс ForkJoinTask преобразует (через класс RecursiveAction)
// значения элементов типа double в их квадратные корни
public class SqrtTransform extends RecursiveAction {

    final int seqThreshold = 1000;

    double [] data;

    int start, end;

    SqrtTransform(double[] vals, int s, int e){
        data = vals;
        start = s;
        end = e;
    }


    @Override
    protected void compute() {

        if ((end - start) < seqThreshold){
            for (int i = start; i < end; i++) {
                data[i] = Math.sqrt(data[i]);

            }
        } else {
            int middle = (start + end) / 2;

            invokeAll(new SqrtTransform(data, start, middle));
            invokeAll(new SqrtTransform(data, middle, end));
        }

    }
}
