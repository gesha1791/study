package chaplinskiy.javacore.chapter15;

public class EmptyArrayException extends Exception {
    EmptyArrayException(){
        super("Массив пуст");
    }
}
