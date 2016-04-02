package server.database.dao;

import java.sql.SQLException;

import server.database.User;

public class MySqlUserDao extends MySqlBaseDao implements UserDao {
	
	private String getUser = "SELECT * FROM hotel.users WHERE users.username = ? AND users.password = ? ";

	@Override
	public User getUserByUsernameAndPass(String username, String password) {
		try {
			prStatement = conn.getConnDB().prepareStatement(getUser);
			prStatement.setString(1, username);
			prStatement.setString(2, password);
			result = prStatement.executeQuery();
			return resultToObject();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	protected User resultToObject() throws SQLException {
		User user = new User();
		while(result.next()) {
			user.setId(result.getInt("users.id"));
			user.setUsername(result.getString("users.username"));
			user.setPassword(result.getString("users.password"));
			user.setRole(result.getInt("users.role"));
		}
		return user;
	}
}
