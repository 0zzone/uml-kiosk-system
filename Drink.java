public class Drink extends Item {

	Double volume;

	public Drink(String name, Double price, AddOn[] availableAddOns, int availaibility, Double volume){
		super(name, price, availableAddOns, availaibility);
		this.volume = volume;
	}

}