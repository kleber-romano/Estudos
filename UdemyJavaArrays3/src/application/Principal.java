package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rooms;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String name = null; 
		String email = null;
		int room = 0;
		
		Rooms[] vect = new Rooms[10];
		
		System.out.println("How many rooms will be rented? ");
		int n = sc.nextInt();
		sc.nextLine();
				
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Rent #" + i);
			System.out.print("Name: ");
			name = sc.nextLine();
			System.out.print("email: ");
			email = sc.nextLine();
			System.out.print("Room: ");
			room = sc.nextInt();
			sc.nextLine();
			
			vect[room] = new Rooms(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i].toString());
			}
		}
		
		sc.close();
	}

}
