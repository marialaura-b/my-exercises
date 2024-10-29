package io.codeforall.bootcamp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    String hostName = "localhost";
    private final int portNumber = 8080;

    public static void main(String[] args) {

        Server server = new Server(); //crio um server
        server.bindSocket(); // server invoca o método bindSocket
    }

    public void bindSocket() {

        try (ServerSocket serverSocket = new ServerSocket(portNumber)) { // obj que permite ao servidor escutar e aceitar conexões de clientes na porta especificada
            while (true) {
                Socket clientSocket = serverSocket.accept(); // aceita a conexão do cliente
                System.out.println("To aQuiiii");
                ServerWorker worker = new ServerWorker(clientSocket); //
                new Thread(worker).start(); 
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}







