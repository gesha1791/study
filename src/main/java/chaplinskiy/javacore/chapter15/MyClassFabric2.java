package chaplinskiy.javacore.chapter15;

public class MyClassFabric2 {
    String str;

    MyClassFabric2(String s){
        str = s;
    }

    MyClassFabric2(){
        str = null;
    }

    String getVal(){
        return str;
    }
}
