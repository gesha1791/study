package chaplinskiy.javacore.chapter15;

public class GenericMethodRefDemo {

    static <T> int myOp(MyFunc3<T> f, T[] vals, T v ){
        int func = f.func(vals, v);
        return func;
    }

    public static void main(String[] args) {
        Integer [] vals = {1,2,3,4,2,3,4,4,5};
        String [] str = {"Один", "Два", "Три", "Два"};
        int count;

        count = myOp(MyArrayOps::countMatching, vals, 4);
        System.out.println(count);

        count = myOp(MyArrayOps::countMatching, str, "Два");
        System.out.println(count);
    }
}
