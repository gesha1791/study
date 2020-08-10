package chaplinskiy.javacore.chapter15;

public class ConstructorRefDemo2 {

    public static void main(String[] args) {
        MyFunc5<Integer> myClassCons = MyClass2<Integer>::new;
        MyClass2<Integer> func = myClassCons.func(5);

        System.out.println(func.getVal());
    }
}
