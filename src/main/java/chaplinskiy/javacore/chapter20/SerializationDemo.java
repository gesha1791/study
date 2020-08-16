package chaplinskiy.javacore.chapter20;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) {
        try(ObjectOutputStream objOStream =  new ObjectOutputStream(new FileOutputStream("serial"))) {
            MyClass obj1 = new MyClass("Hello", -7, 2.7e10);
            System.out.println("obj1: " + obj1.toString());
            objOStream.writeObject(obj1);
        } catch (IOException e){
            System.out.println("Исключенеи сериализации");
        }

        try(ObjectInputStream objIStream =
                    new ObjectInputStream(new FileInputStream("serial"))) {
            MyClass obj2 = (MyClass) objIStream.readObject();
            System.out.println("obj2: " + obj2);
        } catch (Exception e){
            System.out.println("Ошибка сериализации");
            System.exit(0);
        }

    }
}
