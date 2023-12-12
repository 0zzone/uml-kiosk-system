package uml;
public class Snack extends Item {

	public Double weight;

	protected Snack(String name, Double price, int availability, Double weight) {
		super(name, price, availability);
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Snack (weight: %.2f) --> ".formatted(weight) + super.toString();
	}
}