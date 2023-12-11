public class Item {

	String name;
	Double price;
	AddOn[] availableAddOns;
	int availaibility;

	public Item(String name, Double price, AddOn[] availableAddOns, int availaibility){
		this.name = name;
		this.price = price;
		this.availableAddOns = new AddOn[100];
		this.availaibility = availaibility;
	}

	public AddOn[] getAddOns(){
		return this.availableAddOns;
	}

}