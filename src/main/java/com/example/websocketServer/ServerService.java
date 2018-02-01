package com.example.websocketServer;

import org.java_websocket.WebSocketImpl;

public class ServerService implements Runnable{
	
	int port = 38080;
	
	public void serverMain(){
    	
    	WebSocketImpl.DEBUG = false;
    	
    	Server server = new Server(port);
    	
    	server.start();
    	
    }

	@Override
	public void run() {
		serverMain();
	}

}
