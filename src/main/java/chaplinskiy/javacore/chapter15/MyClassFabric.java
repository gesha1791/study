package chaplinskiy.javacore.chapter15;

public class MyClassFabric<T> {
    private T val;

    // Конструктор принимающий один параметр
    MyClassFabric(T v){
        val = v;
    }

    MyClassFabric(){
        val = null;
    }

    T getVal() {
        return val;
    }
}
