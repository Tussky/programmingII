import java.net.*;
import java.io.*;
import javax.swing.*
;
public class IPFinder {
    public static void main(String[] args) {
        String host;
        host = JOptionPane.showInputDialog("Pleae input the server's name");
      try {
        InetAddress address = InetAddress.getByName(host);
        JOptionPane.showMessageDialog(null, "Ip Address: " + address.toString());

        // my own ip address
        InetAddress address2 = InetAddress.getLocalHost();
        System.out.println(address2);

      } catch (UnknownHostException ex) {
        JOptionPane.showMessageDialog(null, "Could not find: "+ host);
      }
    }
}
