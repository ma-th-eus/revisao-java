package secao9fixacao1;

public class ImportedProduct extends Product {
	
	private double customsFee;

	public ImportedProduct(String name, double price, double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	
	public String priceTag() {
		return this.getName() + " $ " + totalPrice() + " (Customs fee: $ " + String.format("%.2f", this.customsFee) + ")";
	}
	
	public double totalPrice() {
		return this.getPrice() + customsFee;
	}
	
	
	

}
