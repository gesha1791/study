package chaplinskiy.javacore.chapter20;

import java.io.File;

public class DirListOnly {
    public static void main(String[] args) {
        String dirname = "/torrent";
        File f1 = new File(dirname);

        OnlyExt pdf = new OnlyExt("pdf");
        String[] list = f1.list(pdf);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }

        File[] files = f1.listFiles(pdf);
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i].getAbsolutePath());
        }
    }
}

// listFiles массив файлов
// mkdir создать каталог
// mkdirs создать полный путь к каталогу
