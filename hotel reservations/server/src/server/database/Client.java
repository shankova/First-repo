package server.database;

public class Client {

	private int id;
	private String name;
	private String family;
	private String phone;

//	public Client(String name, String family, String phone) {
//		super();
//		this.name = name;
//		this.family = family;
//		this.phone = phone;
//	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
