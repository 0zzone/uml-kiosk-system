package uml;
import java.util.ArrayList;

public class Served extends BasketState {

    public Served(Basket basket){
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
        return;
    }

    @Override
    public String toString() {
        return "State [Served]";
    }
}