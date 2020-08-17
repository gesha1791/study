package chaplinskiy.javacore.chapter21;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class DirList_v2 {
    public static void main(String[] args) {
        String dirName = "examples";
        // создать фильтр, возвращающий логическое значение true
        // только в отношении доступных для записи файлов

        DirectoryStream.Filter<Path> how = new DirectoryStream.Filter<Path>() {
            public boolean accept(Path filename) throws IOException {
                if (Files.isWritable(filename)) return false;
                return true;
            }
        };

        try(DirectoryStream<Path> dirStrm = Files.newDirectoryStream(Paths.get(dirName), how)) {
            System.out.println("Каталог " + dirName);

            for(Path entry : dirStrm){
                BasicFileAttributes attr = Files.readAttributes(entry, BasicFileAttributes.class);

                if(attr.isDirectory()){
                    System.out.println("<DIR> ");
                } else {
                    System.out.println("      ");
                }
                System.out.println(entry.getName(1));
            }
        } catch (IOException e){

        }
    }

}
