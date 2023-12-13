package uml;
import java.util.ArrayList;

public class Pending extends BasketState {

    protected Pending(Basket basket) {
        this.basket = basket;
    }

    @Override
    protected void addToBasket(Item item, int quantity, ArrayList<AddOn> addOns) {
        BasketElement el = new BasketElement(item);
        el.quantity = quantity;
        el.addOns = addOns;
        System.out.println();
        basket.elements.add(el);
    }

    @Override
    protected BasketElement editBasketElement(int elementId, int quantity, ArrayList<AddOn> addOns) {
        BasketElement el = null;
        for (BasketElement element : basket.elements) {
            if (element.getId() == elementId) {
                el = element;
                break;
            }
        }
        if (el == null)
            return null;
        el.quantity = quantity;
        el.addOns = addOns;
        return el;
    }

    @Override
    protected BasketElement removeFromBasket(int elementId) {
        for (BasketElement element : basket.elements) {
            if (element.getItem().getId() == elementId) {
                basket.elements.remove(element);
                return element;
            }
        }
        return null;
    }

    @Override
    protected void setUser(User user) {
        this.basket.user = user;
    }

    @Override
    public void proceed() {
        /**
         * - check if user has been set
         * - make a new transaction
         * - updateItemsAvailability()
         * - set state of Basket to Confirmed
         */
        if (basket.user == null)
            return;
        Double total = basket.getTotalPrice();
        basket.getKiosk().createTransaction(basket.user, total);
        _updateItemsAvailability();
        basket.state = new Confirmed(this);
    }

    private void _updateItemsAvailability() {
        for (BasketElement element : basket.elements) {
            element.getItem().availability -= element.quantity;
        }
    }

    @Override
    public String toString() {
        return "State [Pending]";
    }
}