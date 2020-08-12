package chaplinskiy.javacore.chapter15;

public class ConstructorRefDemo {
    public static void main(String[] args) {
        // Создать ссылку на конструктор класса MyClass
        // Метод func из интерфейса MyFunc4 принимает аргуемент,
        // поэтому оператор new обращается к параметризированному
        // конструктору класса MyClass, а не к его конкструктору по умолчанию
        MyFunc4 myClassCons = MyClass::new;

        MyClass mc = myClassCons.func(100);
        System.out.println(mc.getVal());
    }
}
