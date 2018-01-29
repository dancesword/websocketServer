package com.example.websocketServer;

import java.net.InetSocketAddress;

import org.java_websocket.WebSocket;
import org.java_websocket.WebSocketImpl;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;

public class Server extends WebSocketServer implements Runnable{
	
	public Server(int port) {
        super(new InetSocketAddress(port));
    }

    public Server(InetSocketAddress address) {
        super(address);
    }

	@Override
	public void onClose(WebSocket websocket, int i, String s, boolean flag) {
		
		System.out.println("server connection close");
	}

	@Override
	public void onError(WebSocket websocket, Exception exception) {
		
		System.out.println("server connection error");
	}

	@Override
	public void onMessage(WebSocket websocket, String s) {
		
		System.out.println("server receive message-----" + s);
	}

	@Override
	public void onOpen(WebSocket websocket, ClientHandshake clienthandshake) {
		
		System.out.println("server open connection");
		
	}

	@Override
	public void onStart() {
		
		System.out.println("server connect start");
	}

    public static void serverMain(){
    	
    	WebSocketImpl.DEBUG = false;
    	
    	int port = 38080;
    	
    	Server server = new Server(port);
    	
    	server.start();
    }

}
