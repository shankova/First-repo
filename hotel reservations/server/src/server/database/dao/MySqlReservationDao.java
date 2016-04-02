package server.database.dao;

import java.sql.SQLException;

import server.database.Reservation;

public class MySqlReservationDao extends MySqlBaseDao implements ReservationDao {

	@Override
	protected Reservation resultToObject() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
}
