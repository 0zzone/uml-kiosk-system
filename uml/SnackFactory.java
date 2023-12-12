package uml;
public class SnackFactory extends ItemFactory {
    SnackFactory() {
    }

    @Override
    public Item createItem(String name, Double price, int availability) {
        return new Snack(name, price, availability, 1.0);
    }
}