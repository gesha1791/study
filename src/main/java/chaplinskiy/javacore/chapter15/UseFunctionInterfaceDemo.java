package chaplinskiy.javacore.chapter15;

import java.util.function.Function;

public class UseFunctionInterfaceDemo {
    public static void main(String[] args) {
        Function<Integer, Integer> factorial = n -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
            return result;
        };

        System.out.println(factorial.apply(3));
        System.out.println(factorial.apply(5));
    }
}
