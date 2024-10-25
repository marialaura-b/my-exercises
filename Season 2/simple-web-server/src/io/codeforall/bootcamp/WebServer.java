package io.codeforall.bootcamp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Single-threaded simple web server implementation
 */
public class WebServer {

    private static final Logger logger = Logger.getLogger(WebServer.class.getName());

    public static final String DOCUMENT_ROOT = "www/";
    public static final int DEFAULT_PORT = 8085;

    private static final int MAX_THREADS = 10; // Número máximo de threads no pool

    private ServerSocket bindSocket = null;
    private final ExecutorService threadPool = Executors.newFixedThreadPool(MAX_THREADS); // Pool de threads para múltiplos clientes

    public static void main(String[] args) {

        try {

            int port = args.length > 0 ? Integer.parseInt(args[0]) : DEFAULT_PORT;

            WebServer webServer = new WebServer();
            webServer.listen(port);

        } catch (NumberFormatException e) {

            System.err.println("Usage: WebServer [PORT]");
            System.exit(1);

        }
    }

    private void listen(int port) {

        try {

            bindSocket = new ServerSocket(port);
            logger.log(Level.INFO, "server bind to " + getAddress(bindSocket));

            serve(bindSocket);

        } catch (IOException e) {

            logger.log(Level.SEVERE, "could not bind to port " + port);
            logger.log(Level.SEVERE, e.getMessage());
            System.exit(1);

        }
    }

    private void serve(ServerSocket bindSocket) {
        // Mantém o servidor ouvindo por novas conexões
        while (true) {

            try {
                // Aceita uma nova conexão do cliente
                Socket clientSocket = bindSocket.accept();
                logger.log(Level.INFO, "new connection from " + getAddress(clientSocket));

                // Submete a conexão para ser processada por uma thread do pool
                threadPool.submit(() -> dispatch(clientSocket));


            } catch (IOException e) {

                logger.log(Level.SEVERE, e.getMessage());

            }
        }
    }

    private void dispatch(Socket clientSocket) {

        try {

            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());

            String requestHeaders = fetchRequestHeaders(in);
            if (requestHeaders.isEmpty()) {
                close(clientSocket);
                return;
            }

            String[] requestParts = requestHeaders.split("\n")[0].split(" ");
            String httpVerb = requestParts[0];
            String resource = requestParts.length > 1 ? requestParts[1] : null;

            logger.log(Level.INFO, "Request received: " + httpVerb + " " + resource);
            logger.log(Level.FINE, "Headers:\n" + requestHeaders);

            if (!httpVerb.equals("GET")) {
                logger.log(Level.WARNING, "request not supported from " + getAddress(clientSocket));
                reply(out, HttpHelper.notAllowed());
                close(clientSocket);
                return;

            }

            if (resource == null || resource.trim().isEmpty()) {
                logger.log(Level.WARNING, "resource not specified from " + getAddress(clientSocket));
                reply(out, HttpHelper.badRequest());
                close(clientSocket);
                return;
            }

            String filePath = getPathForResource(resource);
            File file = new File(filePath);
            if (!file.exists() || file.isDirectory()) {
                logger.log(Level.WARNING, "request for content type not supported from " + getAddress(clientSocket));
                reply(out, HttpHelper.notFound());
                filePath = DOCUMENT_ROOT + "404.html";
                file = new File(filePath);
            }

            File file = new File(filePath);
            if (file.exists() && !file.isDirectory()) {

                reply(out, HttpHelper.ok());

            } else {

                logger.log(Level.WARNING, file.getPath() + " not found");
                reply(out, HttpHelper.notFound());
                filePath = WebServer.DOCUMENT_ROOT + "404.html";
                file = new File(filePath);

            }

            reply(out, HttpHelper.ok());
            reply(out, HttpHelper.contentType(filePath));
            reply(out, HttpHelper.contentLength(file.length()));
            streamFile(out, file);

        } catch (IOException ex) {
            logger.log(Level.WARNING, ex.getMessage());
        } finally {
            close(clientSocket);
        }


    }

    private String fetchRequestHeaders(BufferedReader in) throws IOException {

        String line;
        StringBuilder builder = new StringBuilder();

        // read the full http request
        while ((line = in.readLine()) != null && !line.isEmpty()) {
            builder.append(line + "\n");
        }

        return builder.toString();

    }

    private String getPathForResource(String resource) {

        String filePath = resource;

        Pattern pattern = Pattern.compile("(\\.[^.]+)$"); // regex for file extension
        Matcher matcher = pattern.matcher(filePath);

        if (!matcher.find()) {
            filePath += "/index.html";
        }

        filePath = WebServer.DOCUMENT_ROOT + filePath;

        return filePath;
    }

    private void reply(DataOutputStream out, String response) throws IOException {
        out.writeBytes(response);
    }

    private void streamFile(DataOutputStream out, File file) throws IOException {
        try (FileInputStream in = new FileInputStream(file)) {
        byte[] buffer = new byte[1024];
        FileInputStream in = new FileInputStream(file);

        int numBytes;
        while ((numBytes = in.read(buffer)) != -1) {
            out.write(buffer, 0, numBytes);
        }

        in.close();

    }

    private void close(Socket clientSocket) {

        try {

            logger.log(Level.INFO, "closing client socket for " + getAddress(clientSocket));
            clientSocket.close();

        } catch (IOException e) {

            logger.log(Level.INFO, e.getMessage());
        }

    }

    private String getAddress(ServerSocket socket) {

        if (socket == null) {
            return null;
        }

        return socket.getInetAddress().getHostAddress() + ":" + socket.getLocalPort();
    }

    private String getAddress(Socket socket) {
        return socket.getInetAddress().getHostAddress() + ":" + socket.getLocalPort();
    }

}
