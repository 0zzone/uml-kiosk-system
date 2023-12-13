package uml;
import java.util.ArrayList;

public class Confirmed extends BasketState {

    public Confirmed(Basket basket){
        this.basket = basket;
    }

    @Override
    protected void setUser(User user) {
    }

    @Override
    protected void addToBasket(Item item, int quantity, ArrayList<AddOn> addOns) {
    }

    @Override
    protected BasketElement editBasketElement(int elementId, int quantity, ArrayList<AddOn> addOns) {
        return null;
    }

    @Override
    protected BasketElement removeFromBasket(int elementId) {
        return null;
    }

    @Override
    public void proceed() {
        basket.state = new Served(this);
    }

    @Override
    public String toString() {
        return "State [Confirmed]";
    }
}