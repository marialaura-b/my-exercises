package io.codeforall.bootcamp;

import java.io.IOException;
import java.io.OutputStream;

public class Send404Response {
    public static void send404Response(OutputStream output) throws IOException {
        String body = "<html><body><h1>404 Not Found</h1></body></html>";
        byte[] bodyBytes = body.getBytes();
        String response = "HTTP/1.0 404 Not Found\r\n" +
                "Content-Type: text/html; charset=UTF-8\r\n" +
                "Content-Length: " + bodyBytes.length + "\r\n" +
                "\r\n";
        output.write(response.getBytes());
        output.write(bodyBytes);
        output.flush();
    }
}