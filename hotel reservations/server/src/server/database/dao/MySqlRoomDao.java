package server.database.dao;

import java.sql.SQLException;

import server.database.Room;

public class MySqlRoomDao extends MySqlBaseDao implements RoomDao {

	@Override
	protected Room resultToObject() throws SQLException {
		Room room = new Room();
		while(result.next()) {
			room.setId(result.getInt("rooms.id"));
			room.setCategory(result.getString("category.name"));
			room.setNumber(result.getInt("rooms.number"));
			room.setNumBeds(result.getInt("rooms.num_beds"));
			room.setView(result.getString("rooms.view"));
			room.setArea(result.getInt("rooms.area"));
		}
		return room;
	}
}
