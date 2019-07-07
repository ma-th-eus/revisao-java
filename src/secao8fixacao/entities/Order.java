package secao8fixacao.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import secao8fixacao.enums.OrderStatus;

public class Order {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderStatus status;
	private List<OrderItem> items = new ArrayList<>();
	private Customer customer;
	
	public Order(Customer customer, Date moment, String status) {
		this.moment = moment;
		this.status = OrderStatus.valueOf(status.toUpperCase());
		this.customer = customer;
	}
	
	public double total() {
		double sum = 0;
		
		for (OrderItem oi : items) {
			sum += oi.subTotal();
		}
		
		return sum;
	}
	
	public String getOrderSummary() {
		
		StringBuilder sb = new StringBuilder();
		
		for (OrderItem oi : items) {
			sb.append("\n" + oi.toString());
		}
		
		String allItems = sb.toString();
		
		String status = this.status.toString();
		
		String s = "ORDER SUMMARY:" 
			+ "\nOrder moment: " + sdf.format(moment)
			+ "\nOrder status: " + status.substring(0, 1).toUpperCase() + status.substring(1)
			+ "\nCustomer: " + customer.getName() + " - " + customer.getEmail()
			+ "\nOrder Items:"
			+ allItems + "\n"
			+ "Total price: $" + String.format("%.2f", total());
		
		return s;
					
	}
	
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void setItem(List<OrderItem> item) {
		this.items = item;
	}

	public Customer getCustomer() {
		return customer;
	}
	
	
}
