package io.codeforall.bootcamp;

import java.io.*;
import java.net.*;
import static io.codeforall.bootcamp.Send404Response.send404Response;
import static io.codeforall.bootcamp.SendImageResponse.sendImageResponse;
import static io.codeforall.bootcamp.SendResponse.sendResponse;

public class Server {

    public static void main(String[] args) {

        int port = 8080;

        try (ServerSocket serverSocket = new ServerSocket(port)) {

            System.out.println("Servidor escutando na porta " + port);

            try (Socket clientSocket = serverSocket.accept()) {

                System.out.println("Cliente conectado: " + clientSocket.getInetAddress());

                InputStream input = clientSocket.getInputStream();
                OutputStream output = clientSocket.getOutputStream();

                BufferedReader reader = new BufferedReader(new InputStreamReader(input));

                String requestLine = reader.readLine();
                System.out.println("Requisição: " + requestLine);

                String[] requestParts = requestLine.split(" ");

                String method = requestParts[0];

                String path = requestParts[1];

                if (method.equals("GET")) {
                    // Remove a barra inicial
                    String filePath = path.substring(1);
                    // Se o caminho for um arquivo HTML
                    if (filePath.equals("index.html")) {
                        sendResponse(output, "index/html", "Olá, mundo! Este é um arquivo HTML.");
                    }
                    //Se o caminho for uma imagem (exemplo: image.png)
                    else if (filePath.equals("logo.png")) {
                        sendImageResponse(output, "/Users/codecadet/my-exercises/Season 2/WebServer/www/logo.png");
                    }
                    // Caso contrário, envia 404
                    else {
                        send404Response(output);
                            }
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
    }
