package chaplinskiy.javacore.chapter15;

public class LambdaAsArgumentDemo {

    // первый параметр тип функциональный интерфейс
    static String stringOp(StringFunc sf, String s){
        return sf.func(s);
    }

    public static void main(String[] args) {
        String intStr = "Лямбда выражения повышают эффективность Java";
        String outStr;

        System.out.println("Исходная строка: " + intStr);

        outStr = stringOp(str -> str.toUpperCase(), intStr);
        System.out.println("Эта строка в верхнем регистре: " + outStr);

        outStr = stringOp(str -> {
            String result = "";
            int i;

            for (i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' ') {
                    result += str.charAt(i);
                }
            }

            return result;

            }, intStr);

        System.out.println("Эта строка с удаленными пробелами: " + outStr);

        StringFunc reverse = str -> {
            String result = "";
            int i;

            for (i = str.length()-1; i >=0 ; i--) {
                result += str.charAt(i);
            }
            return result;
        };

        System.out.println("Это перевернутая строка: " + stringOp(reverse, intStr));
    }
}
