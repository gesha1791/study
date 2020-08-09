package chaplinskiy.javacore.chapter13;

// простой пример применения платформенно-ориентированного метода
public class NativeDemo {
    int i;

    public static void main(String[] args) {
        NativeDemo ob = new NativeDemo();
        ob.i = 10;
        System.out.println("перед вызовом: " + ob.i);
        ob.test();
        System.out.println("после вызова: " + ob.i);
    }

    // объявить платформенно-ориентированный метод
    public native void test();

    // загрузить библиотеку DLL, содержащую статический метод
    static {
        System.loadLibrary("NativeDemo");
    }
}
