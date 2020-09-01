package chaplinskiy.javacore.chapter18;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {

        // Начальный размер вектора 3, инкремент 2
        Vector<Integer> v = new Vector<>(3, 2);
        System.out.println("Начальный размер вектора: " + v.size());
        System.out.println("Начальная емкость вектора: " + v.capacity());

        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);

        System.out.println("Емкость после ввдения 4 элементов: " + v.capacity());

        v.addElement(5);

        System.out.println("Текущая емкость: " + v.capacity());

        v.addElement(6);
        v.addElement(7);

        System.out.println("Текущая емкость: " + v.capacity());

        v.addElement(9);
        v.addElement(10);

        System.out.println("Текущая емкость: " + v.capacity());

        System.out.println("first element" + v.firstElement());
        System.out.println("last element" + v.lastElement());

        if(v.contains(3)){
            System.out.println("содержит 3");
        }

        Enumeration<Integer> elements = v.elements();
        System.out.println("Элементы вектора: ");
        while (elements.hasMoreElements()){
            System.out.println(elements.nextElement() + " ");
        }

        System.out.println();

        Iterator<Integer> iterator = v.iterator();

        for(int i : v){

        }
    }
}
