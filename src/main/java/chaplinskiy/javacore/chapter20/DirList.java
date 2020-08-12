package chaplinskiy.javacore.chapter20;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.File;
import java.sql.SQLOutput;

public class DirList {
    public static void main(String[] args) {
        String dirname = "/torrent";
        File f1 = new File(dirname);
        if(f1.isDirectory()){
            System.out.println("Каталог: " + dirname);
            String[] list = f1.list();
            for (int i = 0; i < list.length; i++) {
                File f = new File(dirname + "/" + list[i]);
                if (f.isDirectory()){
                    System.out.println(list[i] + " является каталогом");
                } else {
                    System.out.println(list[i] + " является файлом");
                }
                
            }
        } else {
            System.out.println(dirname + " является файлом");
        }
    }
}
