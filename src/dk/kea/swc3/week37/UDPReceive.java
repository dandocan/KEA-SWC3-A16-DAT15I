package dk.kea.swc3.week37;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 * Created by coag on 13-09-2016.
 */
public class UDPReceive {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName("localhost");
            int port = 7777;
            DatagramSocket socket = new DatagramSocket(port, ip);

            System.out.println("Recive socket rdy to listen on UDP port "+port);



            while (true) {
                byte[] data = new byte[1024];
                DatagramPacket packet = new DatagramPacket(data, data.length);
                socket.receive(packet);
//                System.out.println(Arrays.toString(data));
                String msg = new String(data);
                System.out.println(msg);
                System.out.println(msg.length());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
