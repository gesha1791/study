package chaplinskiy.javacore.chapter15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UseMethodRef {
    static int compareMC(MyClass a, MyClass b){
        return a.getVal() - b.getVal();
    }

    public static void main(String[] args) {
        List<MyClass> al = new ArrayList<>();

        al.add(new MyClass(1));
        al.add(new MyClass(2));
        al.add(new MyClass(3));
        al.add(new MyClass(8));
        al.add(new MyClass(6));
        al.add(new MyClass(5));

        MyClass max = Collections.max(al, UseMethodRef::compareMC);

        System.out.println(max.getVal());
    }
}
