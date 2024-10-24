package io.codeforall.bootcamp;

import java.io.IOException;
import java.io.OutputStream;

public class Send404Response {
    public static void send404Response(OutputStream output) throws IOException {
        //String body = "<html><body><h1>404 Not Found</h1></body></html>";
        //byte[] bodyBytes = body.getBytes();
        byte[] bodyBytes = new byte[5000];
        inputStream = new FileInputStream("www/404.html");
        String response = "HTTP/1.0 404 Not Found\r\n" +
                "Content-Type: text/html; charset=UTF-8\r\n" +
                "Content-Length: " + bodyBytes + "\r\n" +
                "\r\n";
        outputStream.write(response.getBytes());
        output.write(bodyBytes);
        output.flush();

        bytes = new byte[5000];
        inputStream = new FileInputStream("www/404.html");
        bytesread = inputStream.read(bytes);
        out.println("HTTP/1.0 404 Not Found\r\n " +
                "Content-Type: text/html; charset=UTF-8\r\n " +
                "Content-Length: " + bytesread + " \r\n");
        outputStream.write(bytes, 0, bytesread);
        break;
    }
}