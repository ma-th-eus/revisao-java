package secao9fixacao1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Date manufaturedDate;

	public UsedProduct(String name, double price, String manufaturedDate) throws ParseException {
		super(name, price);
		this.manufaturedDate = sdf.parse(manufaturedDate);
	}
	
	public String priceTag() {
		return this.getName() + " $ " + this.getPrice() + " (Manufacture date: " + sdf.format(manufaturedDate) + ")";
	}

}
