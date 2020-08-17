package chaplinskiy.javacore.chapter21;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class DirList {
    public static void main(String[] args) {
        String dirname = "src";

        try(DirectoryStream<Path> dirStream =  Files.newDirectoryStream(Paths.get(dirname))){
            System.out.println("Каталог " + dirname);
            for(Path entry : dirStream){
                BasicFileAttributes attribs = Files.readAttributes(entry, BasicFileAttributes.class);

                if(attribs.isDirectory()){
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
