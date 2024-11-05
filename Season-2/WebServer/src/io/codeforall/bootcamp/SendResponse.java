package io.codeforall.bootcamp;

import java.io.IOException;
import java.io.OutputStream;

public class SendResponse {
    public static void sendResponse(OutputStream output, String contentType, String body) throws IOException {
        byte[] bodyBytes = body.getBytes();
        String response = "HTTP/1.0 200 Document Follows\r\n" +
                "Content-Type: " + contentType + "; charset=UTF-8\r\n" +
                "Content-Length: " + bodyBytes.length + "\r\n" +
                "\r\n";
        output.write(response.getBytes());
        output.write(bodyBytes);
        output.flush();
    }
}
