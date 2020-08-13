package chaplinskiy.javacore.chapter20;

import java.io.Console;

public class ConsoleDemo {
    public static void main(String[] args) {
        String str;
        Console con;

        con = System.console();

        if (con == null){
            System.out.println("не достуна консоль");
            return;
        }

        str = con.readLine("Введите строку: ");
        con.printf("Введеная вами строка: %s\n", str);
    }
}
