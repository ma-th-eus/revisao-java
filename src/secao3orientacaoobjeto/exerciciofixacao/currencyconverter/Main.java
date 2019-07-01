package secao3orientacaoobjeto.exerciciofixacao.currencyconverter;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double dollarPrice;
		double amount;
		
		System.out.println("What's the dollar price? ");
		dollarPrice = sc.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		amount = sc.nextDouble();
		
		double resultado = CurrencyConverter.convertToReal(dollarPrice, amount);
		
		System.out.println("Amount to be paid in reais = " + String.format("%.2f", resultado));
		
		sc.close();

	}

}
