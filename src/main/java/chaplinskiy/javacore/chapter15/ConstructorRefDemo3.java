package chaplinskiy.javacore.chapter15;

public class ConstructorRefDemo3 {

    // R тип создаваемого объекта
    // конструктор принимающий тип T
    static <R,T> R myClassFactory(MyFuncFabric<R, T> cons, T v){
        return cons.func(v);
    }

    public static void main(String[] args) {
        MyFuncFabric<MyClassFabric<Double>, Double> myClassCons = MyClassFabric<Double>::new;

        MyClassFabric<Double> mc = myClassFactory(myClassCons, 100.1);

        System.out.println(mc.getVal());

        MyFuncFabric<MyClassFabric2, String> myClassCons2 = MyClassFabric2::new;
        MyClassFabric2 mc2 = myClassFactory(myClassCons2, "Лямбда");

        System.out.println(mc2.getVal());
    }
}
