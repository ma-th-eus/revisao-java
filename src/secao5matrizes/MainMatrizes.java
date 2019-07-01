package secao5matrizes;

import java.util.Locale;
import java.util.Scanner;

public class MainMatrizes {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Line number: ");
		int lines = sc.nextInt();
		System.out.println("Column number: ");
		int cols = sc.nextInt();
		int[][] mat = new int[lines][cols];
			
		/*for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}*/	
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				mat[i][j] = 3;
			}
		}
		mat[0][1] = 7;
		mat[1][1]= 6;
		mat[1][2] = 9;
		
		System.out.println("What number do you wanna check?");
		int numCheck = sc.nextInt();
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if(mat[i][j] == numCheck) {
					System.out.printf("Position (%d;%d)\n", i, j);
					
					if(j > 0)
						System.out.println("Left: " + mat[i][j-1]);
					
					if(j != mat[i].length-1)
						System.out.println("Right: " + mat[i][j+1]);
					
					if(i > 0)
						System.out.println("UP: " + mat[i-1][j]);
					
					if(i < mat.length -1)
						System.out.println("Down: " + mat[i+1][j]);
				}
			}
		}
		
		System.out.println("\n\n desenho da matriz:");
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				System.out.print(mat[i][j] + " - ");
			}
			System.out.println("");
		}
		
		
		
		
		
		

	}

}
