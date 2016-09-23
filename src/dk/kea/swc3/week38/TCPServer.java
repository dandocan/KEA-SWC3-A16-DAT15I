package dk.kea.swc3.week38;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.SecureRandom;

/**
 * Created by coag on 23-09-2016.
 */
public class TCPServer {

    public static void main(String[] args) {
        try {
            int port = 7878;
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("TCP server running on port " + port);

            while (true) {
                Socket socket = serverSocket.accept();
                DataInputStream in = new DataInputStream(socket.getInputStream());

                Thread t = new Thread(()->{
                    while (true) {
                        try {
                            String msg = in.readUTF();
                            System.out.println("MSG -->" + msg + "<--");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                });
                t.start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
