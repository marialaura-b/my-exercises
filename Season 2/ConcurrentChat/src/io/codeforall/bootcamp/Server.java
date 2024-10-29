package io.codeforall.bootcamp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    String hostName = "localhost";
    private final int portNumber = 8080;

    public static void main(String[] args) {

        Server server = new Server(); // cria instância server
        server.bindSocket(); // invoca o metodo bindSocket para iniciar o server
    }

    public void bindSocket() {

        try (ServerSocket serverSocket = new ServerSocket(portNumber)) { // Cria um objeto ServerSocket para escutar conexões na porta especificada
            while (true) {
                Socket clientSocket = serverSocket.accept(); // aceita a conexão do cliente
                //System.out.println("To aquiiii");
                ServerWorker worker = new ServerWorker(clientSocket); // Cria um objeto ServerWorker para lidar com a conexão do cliente
                new Thread(worker).start(); // Inicia uma nova thread para executar o ServerWorker, é preciso para não iniciar só uma vez
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}