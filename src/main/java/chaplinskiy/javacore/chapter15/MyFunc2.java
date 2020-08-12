package chaplinskiy.javacore.chapter15;

// фунциональный интерфейс с методом, принимающим два ссылочных аргумента
// и возвращающий логическое значение
public interface MyFunc2<T> {
    boolean func(T v1, T v2);
}
