public class Basket {

	Kiosk kiosk;
	User user;
	BasketElement[] elements;
	BasketState state;

	public Basket(Kiosk kiosk, User user){
		this.kiosk = kiosk;
		this.user = user;
		this.elements = new BasketElement[100];
		this.state = new Pending();
	}

}