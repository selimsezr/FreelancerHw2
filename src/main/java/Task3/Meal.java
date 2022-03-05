package Task3;

public class Meal {
	private String meal;
	private String type;

	public Meal(String meal, String type) {
		this.meal = meal;
		this.type = type;
	}

	public String getMeal() {
		return meal;
	}

	public void setMeal(String meal) {
		this.meal = meal;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Meal [meal=" + meal + ", type=" + type + "]";
	}
}