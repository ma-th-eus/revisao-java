package secao4encapsulamento.exerciciofixacao.application;

import java.util.Locale;
import java.util.Scanner;

import secao4encapsulamento.exerciciofixacao.entities.Conta;

public class Main {

	public static void main(String[] args) {

		Conta conta = null;

		String accountNumber = "";
		String accountHolder = "";
		char inicialDepositOpt = ' ';
		double initialDepositValue = 0;

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		accountNumber = sc.next();
		sc.nextLine();
		System.out.print("Enter Account holder: ");
		accountHolder = sc.nextLine();

		System.out.print("Is there an initial deposit? (y/n) ");
		inicialDepositOpt = sc.next().charAt(0);

		while (inicialDepositOpt != 'y' && inicialDepositOpt != 'n') {
			System.out.print("Invalid Option. Type (y/n) ");
			inicialDepositOpt = sc.next().charAt(0);
		}

		if (inicialDepositOpt == 'y') {
			System.out.print("Enter initial deposit value: ");
			initialDepositValue = sc.nextDouble();
			conta = new Conta(accountNumber, accountHolder, initialDepositValue);
		}
		else if (inicialDepositOpt == 'n') {
			conta = new Conta(accountNumber, accountHolder);
		}

		if (!conta.equals(null)) {
			System.out.println("\n" + conta.getDadosDaConta());

			System.out.print("\nEnter deposit value: ");
			conta.depositar(sc.nextDouble());

			System.out.print("\nEnter withdraw value: ");
			conta.sacar(sc.nextDouble());

		}

		sc.close();

	}

}
