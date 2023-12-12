package uml;
import java.util.ArrayList;

public abstract class Item {
	private static IdCounter counter = new IdCounter();
	private int id = counter.getId();
	public String name;
	public Double price;
	protected ArrayList<AddOn> availableAddOns = new ArrayList<AddOn>();
	public int availability;

	public Item(String name, Double price, int availability) {
		this.name = name;
		this.price = price;
		this.availability = availability;
	}

	public ArrayList<AddOn> getAddOns() {
		return this.availableAddOns;
	}

	public AddOn createAddon(String name, Double price, Double size) {
		AddOn addOn = new AddOn(this, name, price, size);
		this.availableAddOns.add(addOn);
		return addOn;
	}

	public int getId() {
		return this.id;
	}
}