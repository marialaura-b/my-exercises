package io.codeforall.bootcamp;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
public class HostNameResolution {
    public static void main(String[] args) {


        String host = "www.google.com";

        try {
            InetAddress address = InetAddress.getByName(host);

            System.out.println(address.getHostAddress());
            System.out.println(address.getHostName());

            boolean reachable = address.isReachable(5000);

            if(reachable) {
                System.out.println("");
            } else {
                System.out.println("");
            }

        } catch
    }
}


    // STEP1: Get your host and port
    String hostName = "localhost";
    int foreignPort = 5000;
    int localPort = 8080;

    // STEP2: Create send and receive buffers
    byte[] sendBuffer = new byte[1024];
    byte[] recvBuffer = new byte[1024];

    // STEP3: Open a UDP (datagram) socket
    DatagramSocket socket = new DatagramSocket(localPort);

    // STEP4.1: Create and receive UDP datagram packet from the socket
    DatagramPacket receivePacket = new DatagramPacket(recvBuffer, recvBuffer.length); //info colocada dentro do recvBuffer
    socket.receive(receivePacket); // blocks while packet not received

            SERVIDOR
// STEP4.2: Create and send UDP datagram packet from the socket
    DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, InetAddress.getByName(hostName), foreignPort);
        socket.send(sendPacket);

// STEP5: Close the socket
        socket.close();