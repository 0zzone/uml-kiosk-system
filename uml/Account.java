package uml;

public class Account {
	protected Double balance = 0.0;

	protected Account() {
	}

	public void topup(Double amount) {
		this.balance += amount;
	}

	public Double checkBalance() {
		return this.balance;
	}

	protected Double pay(Double amount) {
		this.balance -= amount;
		System.out.println("$%.2d have been deducted from account.".formatted(amount));
		return amount;
	}
}