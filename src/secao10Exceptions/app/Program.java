package secao10Exceptions.app;

import java.util.Locale;
import java.util.Scanner;

import secao10Exceptions.entities.Account;
import secao10Exceptions.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial Balance: ");
		double initialBalance = sc.nextDouble();
		System.out.print("Withdraw Limit: ");
		double withdrawLimit = sc.nextDouble();
		
		Account acc;
		acc = new Account(number, holder, initialBalance, withdrawLimit);
		
		try {
			System.out.print("\nEnter amount of withdraw: ");
			acc.withdraw(sc.nextDouble());
			System.out.println("New balance: " + String.format("%.2f", acc.getBalance()));
						
		}
		catch(DomainException e) {
			System.out.println("Withdraw Error: " + e.getMessage());
		}
		finally {
			sc.close();
		}
		
		

	}

}
