public class Snack extends Item {

	Double weight;

	public Snack(String name, Double price, AddOn[] availableAddOns, int availaibility, Double weight){
		super(name, price, availableAddOns, availaibility);
		this.weight = weight;
	}

}