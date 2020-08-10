package chaplinskiy.javacore.chapter15;

public class LambdaDemo {
    public static void main(String[] args) {
        MyNumber myNumber; // объявить ссылку на функциональный интерфейс

        // Здесь лямбда-выржаение просто является константным выражением.
        // Когда оно присваивается ссылочно переменной myNumber, получается экземпляр класса, в котром лямбда-выражение
        // реализует метод getValue из функционального интерфейса MyNumber

        myNumber = () -> 123.15;

        System.out.println("Фиксированное значение: " + myNumber.getValue());

        myNumber = () -> Math.random() * 123.15;

        System.out.println("Случайное значение: " + myNumber.getValue());
        System.out.println("Еще одно случайное значение: " + myNumber.getValue());


        // Лямбда выражение должно быть совместимо по тиму с абстрактным методом
        //myNumber = () -> "123.04";

    }
}
