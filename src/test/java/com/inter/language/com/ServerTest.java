package com.inter.language.com;

public class ServerTest {
    public static void main(String[] args) {
        Runnable client = new Runnable() {
            @Override
            public void run() {

            }
        };
    }

    public void startClient(){
        Server serverTest = new Server();
    }
}
