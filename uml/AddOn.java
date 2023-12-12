package uml;

public class AddOn {
	private Item item;
	public String name;
	public Double price;
	public Double size;

	public AddOn(Item item, String name, Double price, Double size) {
		this.item = item;
		this.name = name;
		this.price = price;
		this.size = size;
	}

	public Item getItem() {
		return this.item;
	}

	@Override
	public String toString() {
		return "AddOn [name: %s, price: %.2f, size: %.2f]".formatted(name, price, size);
	}
}