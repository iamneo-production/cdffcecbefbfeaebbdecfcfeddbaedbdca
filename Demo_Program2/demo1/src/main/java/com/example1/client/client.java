package main.java.com.example1.client;

import com.example1.server.Server;

public class client {
    public static void main(String[] args) {
        Server server = new Server();
        System.out.println(server.connection);
    }
}
