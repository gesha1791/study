package chaplinskiy.javacore.chapter21;

import java.nio.file.*;

public class DirTreeList {
    public static void main(String[] args) {
        String dirname = "src";

        try {
            Files.walkFileTree(Paths.get(dirname), new MyFileVisitor());
        } catch (Exception e) {
            System.out.println("Ошибка ввода-вывода");
        }
    }
}
