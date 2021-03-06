package server.database;

import java.sql.Date;

public class Reservation {

	private int id;
	private Room room;
	private Client client;
	private Date fromDate;
	private Date toDate;
	private boolean confirmed;
	
//	public Reservation(Room room, Client client, Date fromDate, Date toDate, boolean confirmed) {
//		super();
//		this.room = room;
//		this.client = client;
//		this.fromDate = fromDate;
//		this.toDate = toDate;
//		this.confirmed = confirmed;
//	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public boolean isConfirmed() {
		return confirmed;
	}

	public void setConfirmed(boolean confirmed) {
		this.confirmed = confirmed;
	}
}
