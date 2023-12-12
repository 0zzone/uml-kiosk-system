package uml;
import java.util.ArrayList;

public class Shop {
	public String name; 
	private ArrayList<Item> items = new ArrayList<Item>();
	private ArrayList<Kiosk> kiosks = new ArrayList<Kiosk>();
	private DrinkFactory drinkFactory = new DrinkFactory();
	private SnackFactory snackFactory = new SnackFactory();

	public Shop(String name) {
		this.name = name;
	}

	public ArrayList<Item> browseItems() {
		return this.items;
	}

	public ArrayList<Kiosk> browseKiosks() {
		return this.kiosks;
	}

	public Item addItem(String name, Double price, int availability, String type, Double quantity) {
		Item item = null;
		if (type == "snack") {
			item = snackFactory.createItem(name, price, availability);
			((Snack) item).weight = quantity;
		} else if (type == "drink") {
			item = drinkFactory.createItem(name, price, availability);
			((Drink) item).volume = quantity;
		}

		if (item == null)
			return null;

		this.items.add(item);
		return item;
	}

	public Kiosk addKiosk(String name) {
		Kiosk kiosk = new Kiosk();
		this.kiosks.add(kiosk);
		return kiosk;
	}

	@Override 
	public String toString() {
		String res = "Shop [name: %s]".formatted(name);
		res += "\nItems:";
		for (Item item : items) {
			res += "\n- " + item;
		}
		res += "\n";
		res += "\nKiosks:";
		for (Kiosk kiosk : kiosks) {
			res += "\n- " + kiosk;
		}
		return res;
	}
}