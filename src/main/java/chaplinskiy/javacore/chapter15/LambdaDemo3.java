package chaplinskiy.javacore.chapter15;

public class LambdaDemo3 {
    public static void main(String[] args) {
        NumericTest2 isFactor = (a, b) -> (a % b) == 0;

        // (int a, int b) -> (a % b) == 0 достоверно
        // (int a, b) -> (a % b) == 0 не достоверно

        if (isFactor.test(10, 2)){
            System.out.println("Число 2 является множителем числа 10");
        }

        if (!isFactor.test(10, 3)){
            System.out.println("Число 3 не является множителем числа 10");
        }

    }
}
