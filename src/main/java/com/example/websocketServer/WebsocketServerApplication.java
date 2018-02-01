package com.example.websocketServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebsocketServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebsocketServerApplication.class, args);
		
		ServerService serverService = new ServerService();
		Thread thread = new Thread(serverService);
		thread.start();
	}
}
