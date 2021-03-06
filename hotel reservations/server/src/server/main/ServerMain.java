package server.main;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import server.thread.ServerThread;

public class ServerMain {

	public static void main(String[] args) throws IOException {
		
		ServerSocket s_socket = new ServerSocket(9009);
		
		while(true) {
			System.out.println("Waiting...");
			Socket s = s_socket.accept();
			System.out.println("New client connected: " + s.getInetAddress().getHostName());
			Thread thread = new Thread(new ServerThread(s));
			thread.start();
		}
	}
}
