package dk.kea.swc3.week38;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by coag on 23-09-2016.
 */
public class TCPClient {
    public static void main(String[] args) {

        try {
            InetAddress ip = InetAddress.getByName("localhost");
            int port = 7878;

            Socket socket = new Socket(ip, port);

            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("Type your msg: ");
                String msg = sc.nextLine();
                out.writeUTF(msg);
                out.flush();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
