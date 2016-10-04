package dk.kea.swc3.week40;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by coag on 04-10-2016.
 */
public class MyWebServer {

    public static void main(String[] args) {
        try {
            int port = 8080;
            ServerSocket serverSocket = new ServerSocket(port);

            while (true) {
                Socket socket = serverSocket.accept();

                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());

                char[] data = new char[1024];
                in.read(data);

                String msg = new String(data).trim();

                System.out.println("--------REQ Start------------");
                System.out.println(msg);
                System.out.println("--------REQ End------------");

                if (msg.toUpperCase().startsWith("GET")) {
                    out.writeBytes("HTTP/1.1 200 Here is the shit\r\n");


                } else {
                    out.writeBytes("HTTP/1.1 400  I do not understand. I am from Barcelona.\r\n");
                    out.writeBytes("\r\n");
                    socket.close();
                }


            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}




