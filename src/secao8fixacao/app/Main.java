package secao8fixacao.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import secao8fixacao.entities.Customer;
import secao8fixacao.entities.Order;
import secao8fixacao.entities.OrderItem;
import secao8fixacao.entities.Product;

public class Main {
	
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		String customerName;
		String customerEmail;
		String orderStatus;
		Date birthDate;
		int nItemsOrder;
		
		System.out.println("Enter customer data: ");
		
		System.out.print("Name: ");
		customerName = sc.nextLine();
		
		System.out.print("Email: ");
		customerEmail = sc.next();
		
		System.out.print("Birth date (DD/MM/YYYY): ");
		birthDate = sdf.parse(sc.next());
		
		Customer customer = new Customer(customerName, customerEmail, birthDate);
		
		System.out.println("Enter order data: ");
		
		System.out.print("Status: ");
		orderStatus = sc.next();
		
		Order order = new Order(customer, new Date(), orderStatus);
		
		System.out.print("How many items to this order?");
		nItemsOrder = sc.nextInt();
		
		for (int i = 0; i < nItemsOrder; i++) {
			System.out.printf("Enter #%d item data:\n", i+1);
			
			sc.nextLine();
			
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			Product product = new Product(productName, productPrice);
			
			order.addItem(new OrderItem(product, quantity, productPrice));
					
		}
		
		System.out.println("\n\n");
		
		System.out.println(order.getOrderSummary());
	
		sc.close();
		
	}

}
