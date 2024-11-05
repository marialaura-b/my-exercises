package io.codeforall.bootcamp;

import java.io.*;
import java.net.Socket;

public class ClientSocket {

    public static void main(String[] args) throws IOException {

        String hostName = "localhost";
        int portNumber = 8080;

        Socket clientSocket = new Socket (hostName, portNumber);
        System.out.println("Conectado ao chat do servidor.");

        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String userInput;

        while ((userInput = in.readLine()) != null) {
            out.println(userInput);
        }
        clientSocket.close();
        System.out.println("Conexão encerrada.");
    }
}