package uml;
public class Transaction {
	private static IdCounter counter = new IdCounter();
	private int id = counter.getId();
	private User user;
	private Double amount;

	protected Transaction(User user, Double amount) {
		this.user = user;
		this.amount = amount;
	}

	public int getId() {
		return this.id;
	}

	public User getUser() {
		return this.user;
	}

	public Double getAmount() {
		return this.amount;
	}

	@Override
	public String toString() {
		return "Transaction [id: %d, amount: %.2f, user: %s]".formatted(id, amount, user.name);
	}
}