package secao3orientacaoobjeto.exerciciofixacao.ex2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Employee e1 = new Employee();
		
		System.out.println("Name: ");
		e1.setName(sc.nextLine());
		
		System.out.println("Gross Salary: ");
		e1.setGrossSalary(sc.nextDouble());
		
		System.out.println("Tax: ");
		e1.setTax(sc.nextDouble());
		
		System.out.println(e1.getStatus());
		
		System.out.println("Which percentage to increase salary? ");
		e1.increaseSalary(sc.nextDouble());
		
		sc.close();
	}

}
