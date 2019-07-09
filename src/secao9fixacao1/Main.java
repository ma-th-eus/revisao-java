package secao9fixacao1;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		int n;
		System.out.print("Enter the number of products: ");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Product #%d data: \n", i+1);
			
			System.out.print("Common, Used or Imported (c/u/i)? ");
			char type = sc.next().charAt(0);
			
			sc.nextLine();
			System.out.print("Name: ");	
			String name = sc.nextLine();
			
			System.out.print("Price: ");
			double price = sc.nextDouble();
					
			if(type == 'c' || type == 'C') 
				list.add(new CommonProduct(name, price));
			
			else if(type == 'i' || type == 'I') {
				System.out.print("Customs fee: ");
				double fee = sc.nextDouble();
				
				list.add(new ImportedProduct(name, price, fee));
			}
			
			else if(type == 'u' || type == 'U') {
				System.out.print("Manufacture date: ");
				String manufactureDate = sc.next();
				list.add(new UsedProduct(name, price, manufactureDate));
			}
			
			else
				System.out.println("Wrong option!");
			
		}
		
		System.out.println("\n\nPRICETAGS: ");
		
		for (Product p : list) {
			System.out.println(p.priceTag());
		}
		
		
		sc.close();

	}

}
