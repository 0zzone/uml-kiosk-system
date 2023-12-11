public class BasketElement {

	Item item;
	int quantity;
	AddOn[] addOns;

	public BasketElement(Item item, int quantity){
		this.item = item;
		this.quantity = quantity;
		this.addOns = new AddOn[100];
	}

}