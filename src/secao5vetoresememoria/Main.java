package secao5vetoresememoria;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Room[] room = new Room[10];
		
		System.out.println("how many rooms will be rented?");
		int TotalRoomsToRent = sc.nextInt();
		
		for(int i=0; i<TotalRoomsToRent; i++) {
			System.out.printf("\nRent #%d:\n", i+1);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.next();
			
			System.out.print("Room: ");
			int numRoom = sc.nextInt();
			
			room[numRoom] = new Room(name, email);
		}		
		sc.close();
		
		System.out.println("\n\nBusy Rooms: ");
		for(int i=0; i<room.length ; i++) {
			if(room[i] != null)
				System.out.println(i + ": " + room[i].toString());
		}
	}
	
}
