package server.database.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnector {

	private String url = "jdbc:mysql://localhost:3306/hotel";
	private String user = "root";
	private String pass = "1234";
	
	private Connection connDB = null;
	private Statement statement = null;
	
	public DbConnector() {
		connectDB();
	}
	
	private void connectDB()
	{		
		try
		{
			this.connDB = DriverManager.getConnection(url, user, pass);
			if(connDB == null)
			{
				System.out.println("Connection failed!");
				return;
			}
			else
			{
				System.out.println("Connected successfully!");
				this.statement = connDB.createStatement();
			}
		}
		catch(SQLException e)
		{
		      e.printStackTrace();
	    }
	}
	
	public Connection getConnDB () {
		return connDB;
	}
	
	public Statement getStatement() {
		return statement;
	}
}
