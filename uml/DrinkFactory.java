package uml;
public class DrinkFactory extends ItemFactory {
    public DrinkFactory() {
    }

    @Override
    public Item createItem(String name, Double price, int availability) {
        return new Drink(name, price, availability, 1.0);
    }
}