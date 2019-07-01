package secao2topicosbasicos.leituradedados;

import java.util.Scanner;

public class ExBasicoUsandoScanner {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String s = sc.next();
		char gender = sc.next().charAt(0);

		System.out.println(num);
		System.out.println(s);
		System.out.println(gender);

		sc.close();

	}

}
