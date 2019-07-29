package secao12arquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ProgramSimples {

	public static void main(String[] args) {
		File file = new File("/home/matheus/temp/in");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			
			while(sc.hasNextLine()) 
				System.out.println(sc.nextLine());
			
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			if(sc != null)
				sc.close();
		}
	}

}
