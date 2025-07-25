package uml;
public class Drink extends Item {
	public Double volume = 1.0;

	protected Drink(String name, Double price, int availability, Double volume) {
		super(name, price, availability);
		this.volume = volume;
	}

	@Override
	public String toString() {
		return "Drink (volume: %.2f) --> ".formatted(volume) + super.toString();
	}
}