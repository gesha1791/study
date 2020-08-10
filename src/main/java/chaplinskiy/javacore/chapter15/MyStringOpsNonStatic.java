package chaplinskiy.javacore.chapter15;

public class MyStringOpsNonStatic {
    String strReverse(String str){
        String result = "";
        int i;
        for (i = str.length()-1; i >=0 ; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}
