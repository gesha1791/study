package chaplinskiy.javacore.chapter22;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address);

        address = InetAddress.getByName("www.HerbSchildt.com");
        System.out.println(address);

        InetAddress[] allByName = InetAddress.getAllByName("www.google.com");
        for (int i = 0; i < allByName.length; i++) {
            System.out.println(allByName[i]);
        }
    }
}
