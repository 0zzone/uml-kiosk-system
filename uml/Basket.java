package uml;

import java.util.ArrayList;

public class Basket {
	private static IdCounter counter = new IdCounter();
	private int id = counter.getId();
	private Kiosk kiosk;
	protected User user = null;
	protected ArrayList<BasketElement> elements = new ArrayList<BasketElement>();
	protected BasketState state = new Pending();

	protected Basket(Kiosk kiosk) {
		this.kiosk = kiosk;
	}

	protected void setState(BasketState state) {
		this.state = state;
	}

	public ArrayList<BasketElement> getElements() {
		return this.elements;
	}

	public Double getTotalPrice() {
		Double total = 0.0;
		for (BasketElement element : this.elements) {
			total += element.getItem().price * element.quantity;
			for (AddOn addOn : element.addOns) {
				total += addOn.price * element.quantity;
			}
		}
		return total;
	}

	public void addElement(Item item, int quantity, ArrayList<AddOn> addOns) {
		this.state.addToBasket(item, quantity, addOns);
	}

	public BasketElement editElement(int elementId, int quantity, ArrayList<AddOn> addOns) {
		return this.state.editBasketElement(elementId, quantity, addOns);
	}

	public BasketElement removeElement(int elementId) {
		return this.state.removeFromBasket(elementId);
	}

	public Kiosk getKiosk() {
		return this.kiosk;
	}

	public int getId() {
		return this.id;
	}

	public boolean isConfirmed() {
		return !(this.state instanceof Pending);
	}

	public void confirm(User user) {
		this.state.setUser(user);
		if (!this.isConfirmed()) {
			this.state.proceed();
		}
	
	}

	public void serve() {
		if (this.state instanceof Confirmed) {
			this.state.proceed();
		}
	}

	@Override
	public String toString() {
		String res = "Basket [id: %d, total price: %.2f, user: %s]".formatted(id, getTotalPrice(),
				user == null ? "None" : user.name);
		res += state.toString();
		res += "\nElements:";
		for (BasketElement element : elements) {
			res += "\n- " + element;
		}
		return res;
	}
}