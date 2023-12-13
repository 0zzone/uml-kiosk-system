package uml;
import java.util.ArrayList;

public class BasketElement {
	private static IdCounter counter = new IdCounter();
	private int id = counter.getId();
	private Item item;
	public int quantity = 1;
	public ArrayList<AddOn> addOns = new ArrayList<AddOn>();

	protected BasketElement(Item item) {
		this.item = item;
	}

	public Item getItem() {
		return this.item;
	}

	public int getId() {
		return this.id;
	}

	@Override
	public String toString() {
		String res = "BasketElement [id: %d, quantity: %d]".formatted(id, quantity);
		res += "\n-- " + item;
		res += "\nAddons:";
		for (AddOn addOn : addOns) {
			res += "\n--> " + addOn;
		}
		return res;
	}
}