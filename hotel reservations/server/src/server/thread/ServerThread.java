package server.thread;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import server.database.User;
import server.database.manager.UserManager;

import com.google.gson.Gson;

public class ServerThread implements Runnable {

	Socket socket = null;
	UserManager userManager = new UserManager();
	private DataInputStream input = null;
	private DataOutputStream output = null;

	public ServerThread (Socket socket)
	{
		try
		{
		   this.socket=socket;
		   input = new DataInputStream(socket.getInputStream());
		   output = new DataOutputStream(socket.getOutputStream());
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		try {
			User currentUser = login();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public User login() throws IOException {
		System.out.println(input.readLine());
		System.out.println(input.readLine());
		return null;
	}

}
