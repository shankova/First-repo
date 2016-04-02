package server.database.dao;

import java.sql.SQLException;

import server.database.Client;

public class MySqlClientDao extends MySqlBaseDao implements ClientDao {

	@Override
	protected Client resultToObject() throws SQLException {
		Client client = new Client();
		while(result.next()) {
			client.setId(result.getInt("clients.id"));
			client.setName(result.getString("clients.name"));
			client.setFamily(result.getString("clients.family"));
			client.setPhone(result.getString("clients.phone"));
		}
		return client;
	}
}
