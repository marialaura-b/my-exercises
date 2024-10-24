package io.codeforall.bootcamp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {

        int port = 8080;

        try (ServerSocket serverSocket = new ServerSocket(port)){//é usado para aceitar conexões de entrada de clientes, permitindo que o servidor se comunique com os clientes que se conectarem a essa porta.
            System.out.println("Servidor escutando na porta " + port);

            while (true) {
                try (Socket clientSocket = serverSocket.accept()) {
                    System.out.println("Cliente conectado: " + clientSocket.getInetAddress());
                    PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                    BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                    OutputStream outputStream = clientSocket.getOutputStream();

                    String requestLine = in.readLine(); //requestline recebe o result do metodo

                    if (requestLine == null) {
                        continue; // Caso a linha de requisição seja nula, pula para a próxima iteração
                    }

                    System.out.println("Requisição recebida: " + requestLine);

                    // Processa a requisição com base na linha lida
                    if (requestLine.startsWith("GET")) {
                        String[] requestParts = requestLine.split(" ");
                        if (requestParts.length < 2) {
                            send404Response(out, outputStream);
                            continue;
                        }

                        String path = requestParts[1];
                        switch (path) {
                            case "/logo.png":
                                sendFileResponse("www/logo.png", "image/png", out, outputStream);
                                break;
                            case "/index.html":
                                sendFileResponse("www/index.html", "text/html; charset=UTF-8", out, outputStream);
                                break;
                            default:
                                send404Response(out, outputStream);
                                break;
                        }
                    } else {
                        send404Response(out, outputStream);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao iniciar o servidor: " + e.getMessage());
        }
    }

    private static void sendFileResponse(String filePath, String contentType, PrintWriter out, OutputStream outputStream) {
        File file = new File(filePath);
        if (!file.exists() || !file.isFile()) {
            send404Response(out, outputStream);
            return;
        }

        try (FileInputStream inputStream = new FileInputStream(file)) {
            byte[] bytes = inputStream.readAllBytes();
            int contentLength = bytes.length;

            // Envia o cabeçalho HTTP
            out.println("HTTP/1.0 200 OK");
            out.println("Content-Type: " + contentType);
            out.println("Content-Length: " + contentLength);
            out.println();
            out.flush();

            // Envia o conteúdo do arquivo
            outputStream.write(bytes);
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
            send404Response(out, outputStream);
        }
    }

    private static void send404Response(PrintWriter out, OutputStream outputStream) {
        String responseBody = "<html><body><h1>404 Not Found</h1><p>The requested resource was not found on this server.</p></body></html>";
        byte[] responseBytes = responseBody.getBytes();

        // Envia o cabeçalho HTTP para a resposta 404
        out.println("HTTP/1.0 404 Not Found");
        out.println("Content-Type: text/html; charset=UTF-8");
        out.println("Content-Length: " + responseBytes.length);
        out.println();
        out.flush();

        // Envia o corpo da resposta 404
        try {
            outputStream.write(responseBytes);
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}