package secao2topicosbasicos;

import java.util.Scanner;

public class ExercicioFixacao1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int cont = 0;
		int higher;
		
		System.out.println("Enter N: ");
		num = sc.nextInt();
		higher = num;
		
		while(cont < 4){		
						
			if(num <= 0) {
				System.out.println("N must be positive! Try again: ");
				num = sc.nextInt();
				continue;
			}
			
			cont++;
			
			System.out.println("Value #" + cont + ":");
			num = sc.nextInt();
			
			if(num > higher)
				higher = num;
		}
		
		System.out.println("Higher = " + higher);
		
		sc.close();
		
	}

}
