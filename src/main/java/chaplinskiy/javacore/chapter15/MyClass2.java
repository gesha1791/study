package chaplinskiy.javacore.chapter15;

public class MyClass2<T> {
    private T val;

    MyClass2(T v){
        val = v;
    }

    MyClass2(){
        val = null;
    }

    T getVal() {
        return val;
    }
}
