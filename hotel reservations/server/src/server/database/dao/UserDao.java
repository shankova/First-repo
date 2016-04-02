package server.database.dao;

import server.database.User;

public interface UserDao {

	User getUserByUsernameAndPass(String username, String password);
}
