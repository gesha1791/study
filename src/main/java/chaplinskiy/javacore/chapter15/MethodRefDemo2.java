package chaplinskiy.javacore.chapter15;

public class MethodRefDemo2 {

    static String stringOp(StringFunc sf, String s){
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Лямбда-выражения повышают эффективность Java";
        String outStr;

        MyStringOpsNonStatic strOps = new MyStringOpsNonStatic();

        outStr = stringOp(strOps::strReverse, inStr);
        System.out.println(inStr);
        System.out.println(outStr);
    }
}
