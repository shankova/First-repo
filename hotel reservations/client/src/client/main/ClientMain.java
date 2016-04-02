package client.main;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientMain {

	private static Socket socket;
	private static Scanner sc;
	private static DataInputStream input;
	private static DataOutputStream output;
	
	private static final String loginString = "\n***Login***";
	
	public static void main(String[] args) throws UnknownHostException, IOException {	
		sc = new Scanner (System.in);
		socket = new Socket ("localhost", 9009);
		input = new DataInputStream (socket.getInputStream());
		output = new DataOutputStream (socket.getOutputStream());
		System.out.println("Connedted to server");

		login();
	}
	
	private static void login() throws IOException {
		System.out.println(loginString);
		System.out.println("Username: ");
		String username = sc.nextLine();
		System.out.println("Password: ");
		String password = sc.nextLine();
		output.writeBytes(username);
		output.writeBytes(password);
	}
	
	
}
