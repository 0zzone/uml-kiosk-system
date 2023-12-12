package uml;
import java.util.ArrayList;

public abstract class BasketState {
	protected Basket basket;

	protected abstract void setUser(User user);
	protected abstract void addToBasket(Item item, int quantity, ArrayList<AddOn> addOns);
	protected abstract BasketElement editBasketElement(int elementId, int quantity, ArrayList<AddOn> addOns);
	protected abstract BasketElement removeFromBasket(int elementId);
	protected abstract void proceed();
}