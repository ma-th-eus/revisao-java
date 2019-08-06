package secao14GenericSet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExercicioFixacaoSet {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		Set<Integer> courseA = new HashSet<>();
		Set<Integer> courseB = new HashSet<>();
		Set<Integer> courseC = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		num = sc.nextInt();
		for(int i = 0; i < num; i++) {
			courseA.add(sc.nextInt());
		}
		
		System.out.print("How many students for course B? ");
		num = sc.nextInt();
		for(int i = 0; i < num; i++) {
			courseB.add(sc.nextInt());
		}
		
		System.out.print("How many students for course C? ");
		num = sc.nextInt();
		for(int i = 0; i < num; i++) {
			courseC.add(sc.nextInt());
		}
		
		Set<Integer> total = new HashSet<>();
		total.addAll(courseA);
		total.addAll(courseB);
		total.addAll(courseC);
		
		System.out.println("Total students: " + total.size());

	}

}
