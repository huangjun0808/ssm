package com.weshine.server;

import com.weshine.server.netty.WsServer;

public class MainServer {

    public static void main(String[] args) throws Exception {
        new WsServer(8899).start();
    }
}
