package chaplinskiy.javacore.chapter13;

import java.applet.Applet;
import java.awt.*;

public class SimpleApplet extends Applet {
    /*
    <applet code="SimpleApplet" width=200 height=60>
    </applet>
     */

    public void paint(Graphics g){
        g.drawString("Простейший апплет", 20, 20);
    }
}
