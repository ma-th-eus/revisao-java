package secao13interfaces.exercicio.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import secao13interfaces.exercicio.entities.Contract;
import secao13interfaces.exercicio.entities.Installment;
import secao13interfaces.exercicio.services.ContractService;
import secao13interfaces.exercicio.services.PaypalService;

public class ProgramExercicioInterface {
	
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter contract data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.next());
		System.out.print("Contract value: ");
		double contractValue = sc.nextDouble();
		System.out.print("Enter number of installments: ");
		int numInstallMents = sc.nextInt();
		
		Contract contract = new Contract(number, date, contractValue, numInstallMents);
		
		System.out.println("Installments:");
		
		ContractService cs = new ContractService(new PaypalService());
		
		cs.processContract(contract, numInstallMents);	
		
		for (Installment i : contract.getInstallments()) {
			System.out.println(sdf.format(i.getDueDate()) + " - " + i.getAmount());			
		}
		
		sc.close();
		
	}
	
}
