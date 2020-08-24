package chaplinskiy.javacore.chapter18;

import java.util.LinkedList;

public class MailList {
    public static void main(String[] args) {
        LinkedList<Address> addresses = new LinkedList<>();

        addresses.add(new Address("L.W. West", "11 Oak", "Urbana", "IL", "1234"));
        addresses.add(new Address("L.W. West", "11 Oak", "Urbana", "IL", "1234"));
        addresses.add(new Address("L.W. West", "11 Oak", "Urbana", "IL", "1234"));
        addresses.add(new Address("L.W. West", "11 Oak", "Urbana", "IL", "1234"));

        for(Address a : addresses){
            System.out.println(a + "\n");
        }
        System.out.println();

    }
}
