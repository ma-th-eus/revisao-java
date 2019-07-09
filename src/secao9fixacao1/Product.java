package secao9fixacao1;

public class Product {
	
	private String name;
	private double price;
	
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public String priceTag() {
		return name + " $ " + String.format("%.2f", price);
	}

	protected String getName() {
		return name;
	}

	protected double getPrice() {
		return price;
	}
	
	
	

}
