package secao14GenericSet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExercicioFixacaoMap {

	public static void main(String[] args) {
		String path = "/home/matheus/temp/in.txt";
		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> candidatos = new HashMap<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line;
			while(br.ready()) {
				line = br.readLine();
				String[] fields = line.split(",");
				int previousCount = 0;
				if(candidatos.containsKey(fields[0])) 
					previousCount = candidatos.get(fields[0]);
					
				candidatos.put(fields[0], previousCount + Integer.parseInt(fields[1]));			
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		for(String key : candidatos.keySet()) {
			System.out.println(key + ": " + candidatos.get(key));
		}
	}

}
