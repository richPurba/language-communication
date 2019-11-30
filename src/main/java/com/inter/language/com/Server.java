package com.inter.language.com;

import java.io.IOException;
import java.net.*;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class Server {


    public static void main(String[] args) throws IOException {
        startingServer("127.0.0.1",80);
    }

    public static void startingServer(String address, int portNumber) throws IOException {

        try(Socket socket = new Socket()){
            SocketAddress socketAddress = new InetSocketAddress(InetAddress.getByName(address),portNumber);
            int timeoutMillis = 2000;
            long start = System.currentTimeMillis();
            socket.connect(socketAddress, timeoutMillis);
            long stop = System.currentTimeMillis();
            long diff = stop - start;
            System.out.println("the difference is "+diff);
        }catch (SocketTimeoutException e){
            throw new SocketException("Time out"+e);
        }
    }
}
