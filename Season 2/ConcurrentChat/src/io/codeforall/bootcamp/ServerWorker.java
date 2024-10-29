package io.codeforall.bootcamp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerWorker implements Runnable {

    private Socket socket;

    public ServerWorker(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
            try {
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String clientMessage;


                while ((clientMessage = in.readLine()) != null) {
                
                System.out.println(clientMessage);

            }

            } catch (IOException ex) {
                ex.printStackTrace();

            } finally {
                try {
                    if (socket != null && !socket.isClosed()) {
                        socket.close();
                    }
                    System.out.println("Conexão com o cliente encerrada.");
                } catch (IOException e) {
                    System.err.println("Erro ao fechar o socket: " + e.getMessage());

                }
            }
    }
}
