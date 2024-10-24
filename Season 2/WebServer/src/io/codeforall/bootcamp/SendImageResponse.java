package io.codeforall.bootcamp;

import java.io.IOException;
import java.io.OutputStream;

public class SendImageResponse {
    public static void sendImageResponse(OutputStream output, String contentType) throws IOException {
        // Exemplo de uma imagem em byte array (substitua pelo seu arquivo)
        byte[] imageBytes = {}; // Carregue os bytes da imagem aqui.
        String response = "HTTP/1.0 200 Document Follows\r\n" +
                "Content-Type: " + contentType + "\r\n" +
                "Content-Length: " + imageBytes.length + "\r\n" +
                "\r\n";
        //output.print(response.getBytes());
        output.write(response.getBytes());
        output.write(imageBytes);
        output.flush();
    }
}