package io.codeforall.bootcamp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerWorker implements Runnable {

    private Socket socket;

    // Construtor para inicializar o objeto ServerWorker com o socket fornecido
    public ServerWorker(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            // Cria um BufferedReader para ler mensagens do cliente
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String clientMessage;
            while ((clientMessage = in.readLine()) != null) { // Lê msgs até que não tenha mais msgs
                System.out.println(clientMessage);
            }

        } catch (IOException ex) {
            ex.printStackTrace();

        } finally {
            try {
                if (socket != null && !socket.isClosed()) { // Fecha o socket se estiver aberto
                    socket.close();
                }
                System.out.println("Conexão com o cliente encerrada.");
            } catch (IOException e) {
                System.err.println("Erro ao fechar o socket: " + e.getMessage());
            }
        }
    }
}