package uml;
import java.util.ArrayList;

public class Served extends BasketState {

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
    protected void proceed() {
        return;
    }
}