package Task3;

public class Client {
	private String name;
	private String surname;
	private String destination;

	public Client(String name, String surname, String destination) {
		this.name = name;
		this.surname = surname;
		this.destination = destination;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}
}