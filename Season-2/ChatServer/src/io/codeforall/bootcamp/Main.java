package io.codeforall.bootcamp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) throws IOException {

        int portNumber = 8080;

        // STEP2: Bind to local port and block while waiting for client connections
        ServerSocket serverSocket = new ServerSocket(portNumber);

        Socket clientSocket = serverSocket.accept(); // metodo bloqueante a espera do cliente
        // a partir daqui cliente já está ligado ao servidor

        //Setup input and output streams
        //PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        String message;

        while ((message = in.readLine()) != null) { // a espera que venha uma msg na InputStream
            System.out.println(message);
            System.out.println("next message");
        }

        clientSocket.close();
        serverSocket.close();
        System.out.println("Conexão encerrada");
    }
}
