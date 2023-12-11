public class Kiosk {

	Basket[] basketHistory;
	Basket pending;
	Transaction[] transactionHistory;

	public Kiosk(){
		this.basketHistory = new Basket[100];
		this.pending = null;
		this.transactionHistory = new Transaction[100];
	}

}