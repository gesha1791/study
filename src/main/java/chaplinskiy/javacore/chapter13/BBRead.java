package chaplinskiy.javacore.chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BBRead {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите символы, 'q' - для выхода.");

        // читать символы
        do {
            c = (char) br.read();
        } while (c != 'q');
    }
}