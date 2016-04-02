package server.database.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import server.database.connection.DbConnector;

public abstract class MySqlBaseDao {

	protected DbConnector conn = new DbConnector();
	protected PreparedStatement prStatement = null;
	protected ResultSet result = null;
	
	protected abstract Object resultToObject() throws SQLException;
}
