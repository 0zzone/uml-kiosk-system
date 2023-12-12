package uml;
public abstract class ItemFactory {
    public abstract Item createItem(String name, Double price, int availability);
}