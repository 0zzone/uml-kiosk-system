package uml;
import java.util.ArrayList;

public class Kiosk {
	private static IdCounter counter = new IdCounter();
	private int id = counter.getId();
	private ArrayList<Basket> basketHistory = new ArrayList<Basket>();
	Basket pendingBasket = null;
	private ArrayList<Transaction> transactionHistory = new ArrayList<Transaction>();

	public Kiosk() {}
	public Basket getPendingBasket() {
		if (pendingBasket == null) {
			pendingBasket = new Basket(this);
		}
		return this.pendingBasket;
	}

	public void resetBasket() {
		this.pendingBasket = null;
	}

	public void confirmOrder(User user) {
		if (this.pendingBasket == null) return;
		this.pendingBasket.state.setUser(user);
		this.pendingBasket.state.proceed();
	}
    public void createTransaction(User user, Double amount) {
		Transaction transaction = new Transaction(user, amount);
		this.transactionHistory.add(transaction);
    }
}