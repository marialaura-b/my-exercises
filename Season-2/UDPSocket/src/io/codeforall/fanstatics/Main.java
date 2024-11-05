package io.codeforall.fanstatics;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.lang.String;

public class Main {
    public static void main(String[] args) throws IOException {

        byte[] sendBuffer = new byte[1024];
        byte[] recvBuffer = new byte[1024];

        DatagramSocket socket = new DatagramSocket(8080);

        //Create and receive UDP datagram packet from the socket
        DatagramPacket receivePacket = new DatagramPacket(recvBuffer, recvBuffer.length);
        socket.receive(receivePacket); // blocks while packet not received

        String recvString = new String(recvBuffer).trim();
        System.out.println(recvString.toUpperCase());

    }
}
