package chaplinskiy.javacore.chapter15;

public class LambdaDemo2 {
    public static void main(String[] args) {
        NumericTest isEven = (n) -> (n%2) == 0;

        if (isEven.test(10)) System.out.println("10 четное");
        if (!isEven.test(9)) System.out.println("9 нечетное");

        NumericTest isNonNeg = (n) -> n >= 0;

        if (isNonNeg.test(1)) System.out.println("1 положительное");

        if (!isNonNeg.test(-1)) System.out.println("-1 отрицательное");

    }


}
