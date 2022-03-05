package Task3;

import java.util.ArrayList;

public class QantasAirways extends Client {
	ArrayList<Meal> shortTrip = new ArrayList<Meal>();
	ArrayList<Meal> longTrip = new ArrayList<Meal>();
	ArrayList<Client> clients = new ArrayList<Client>();

	public QantasAirways(String name, String surname, String destination) {
		super(name, surname, destination);
		clients.add(new Client(name, surname,destination));
	}

	public ArrayList<Meal> addShortTripMeal(String meal, String type) {
		shortTrip.add(new Meal(meal, type));
		return shortTrip;
	}

	public ArrayList<Meal> addlongTripMeal(String meal, String type) {
		longTrip.add(new Meal(meal, type));
		return longTrip;
	}

	public ArrayList<Meal> delShortTripMeal(String meal, String type) {
		shortTrip.remove(new Meal(meal, type));
		return shortTrip;
	}

	public ArrayList<Meal> delLongTripMeal(String meal, String type) {
		longTrip.remove(new Meal(meal, type));
		return longTrip;
	}

	public ArrayList<Meal> getShortTrip() {
		return shortTrip;
	}

	public ArrayList<Meal> getLongTrip() {
		return longTrip;
	}
}