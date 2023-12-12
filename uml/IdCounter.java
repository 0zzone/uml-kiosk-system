package uml;
public class IdCounter {
    public int id = 0;
    public IdCounter() {};

    public int getId() {
        return id++;
    }
}
