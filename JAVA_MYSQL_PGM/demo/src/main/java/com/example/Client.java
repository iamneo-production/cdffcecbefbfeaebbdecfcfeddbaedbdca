package main.java.com.example;

import java.io.IOException;
import java.net.Socket;

public class Client {
     public static void main(String[] args) {
        try {
            // Connect to the server running on localhost at port 12345
            Socket serverSocket = new Socket("localhost", 12345);
            System.out.println("Connected to the server!");

            // Close the connection (we're only demonstrating connectivity)
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
