package secao9fixacao2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		List<Payer> list = new ArrayList<>();

		int n;
		System.out.print("Enter the number of tax payers: ");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.printf("Tax Payer #%d data: \n", i + 1);

			System.out.print("Individual or Company (i/c)? ");
			char type = sc.next().charAt(0);

			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();

			if (type == 'i' || type == 'I') {
				System.out.print("Health Expenditure: ");
				double healthExpenditure = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpenditure));
			}

			else if (type == 'c' || type == 'C') {
				System.out.print("Number of Employees: ");
				int numEmployees = sc.nextInt();
				list.add(new Company(name, anualIncome, numEmployees));
			}

			else
				System.out.println("Wrong option!");

		}
		
		System.out.println("TAXED PAID: ");
		
		int sum = 0;
		for (Payer p : list) {
			System.out.println(p.getName() + ": $ " + String.format("%.2f", p.taxPaid()));
			sum += p.taxPaid();
		}
		
		System.out.println("\nTOTAL TAXES: $ " + sum);
		
		
		
		sc.close();
	}

}
