package secao2topicosbasicos.leituradedados;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioEntradaDados {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int numBedrooms;
		double price;
		String lastName;
		int age;
		double height;
		
		
		System.out.println("Enter your full name: ");
		name = sc.nextLine();
		
		System.out.println("How many bedrooms are there in your house?");
		numBedrooms = sc.nextInt();
		
		System.out.println("Enter your product price:");
		price = sc.nextDouble();
		
		System.out.println("Enter your last name, age and height:");
		lastName = sc.next();
		age = sc.nextInt();
		height = sc.nextDouble();
		
		System.out.println(name);
		System.out.println(numBedrooms);
		System.out.println(price);
		System.out.println(lastName);
		System.out.println(age);
		System.out.println(height);
		
		sc.close();
		
		
	}
}
