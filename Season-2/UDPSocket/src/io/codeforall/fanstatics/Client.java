package io.codeforall.fanstatics;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;



public class Client {
    public byte[] sendBuffer = new byte[1024];
    public byte[] recvBuffer = new byte[1024];
    private int port = 8080;

    public Client(String host, int port) throws Exception {
        this.port = port;  // Set the port
    }





}
