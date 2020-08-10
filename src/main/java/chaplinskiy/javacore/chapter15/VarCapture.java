package chaplinskiy.javacore.chapter15;

public class VarCapture {
    public static void main(String[] args) {
        // локал переменная которая может быть захвачена
        int num = 10;

        MyFunc myLambda = n -> {
            int v = num + n;

            // недопустимо мы изменяем локал переменную
            // num++;
            return v;
        };

        // приведет к ошибке, потому что num используется в lambda
        // num = 9;
    }
}
