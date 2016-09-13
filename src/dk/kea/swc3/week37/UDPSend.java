package dk.kea.swc3.week37;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

/**
 * Created by coag on 13-09-2016.
 */
public class UDPSend {

    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();

            InetAddress ip = InetAddress.getByName("127.0.0.1");
            int port = 7777;

            Scanner sc = new Scanner(System.in);
            String msg;
            do {
                System.out.println("Type the msg (type exit to kill this app):");
                msg = sc.nextLine();

                byte[] data = msg.getBytes();
                DatagramPacket packet = new DatagramPacket(data, data.length, ip, port);
                socket.send(packet);

                System.out.println(msg + "\n was sent on UPD port " + port);
            } while (!msg.toLowerCase().equals("exit"));




        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
