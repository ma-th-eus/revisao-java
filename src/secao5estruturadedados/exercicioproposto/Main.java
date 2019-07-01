package secao5estruturadedados.exercicioproposto;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> listEmployees = new ArrayList<>();
		
		Integer numEmployees = 0;
		
		System.out.print("How many employess will be registered? ");
		numEmployees = sc.nextInt();
		
		for(int i=0; i<numEmployees; i++) {
			System.out.printf("\nEmployee #%d:\n", i+1);
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			listEmployees.add(new Employee(id, name, salary));
		}
	
		System.out.println("\nEnter the employee id that will have salary increase: ");
		int idEmployee = sc.nextInt();
		System.out.println("Enter the percentage: ");
		double percentIncrease = sc.nextDouble();
		
		for (Employee emp : listEmployees) {
			if(emp.getId() == idEmployee)
				emp.increaseSalary(percentIncrease);
		}
		//Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
			
		System.out.println("\nList of Employees:\n");
		for (Employee emp : listEmployees) {
			System.out.println(emp.toString());
		}

		sc.close();
	}

}
